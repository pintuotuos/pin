package cn.appsys.controller.backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

















import cn.appsys.pojo.Flight_Tickets;
import cn.appsys.pojo.Flights;
import cn.appsys.pojo.bookInfo;
import cn.appsys.pojo.book_type;
import cn.appsys.pojo.edoc_category;
import cn.appsys.pojo.edoc_entry;
import cn.appsys.pojo.project;
import cn.appsys.pojo.workorder;
import cn.appsys.service.AppInfoService;
import cn.appsys.tools.Constants;

@Controller
public class UserLoginController {
	private Logger logger = Logger.getLogger(UserLoginController.class);
	
	@Resource
	private AppInfoService appInfoService;
	@RequestMapping(value="/login")
	public String logins(){
		return "login";
	} 
	@RequestMapping(value="/yang")
	public String login(Model model){
		try {
			List<edoc_category> list=appInfoService.selectCategory();
			List<edoc_entry> lists=appInfoService.selectEntry();
			model.addAttribute("list", list);
			model.addAttribute("lists", lists);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	} 	
	@RequestMapping(value="/select")
	public String selectId(Model model,@RequestParam(value="lei")Integer id
			){
		try {
			List<edoc_category> list=appInfoService.selectCategory();
			List<edoc_entry> lists=appInfoService.selectEntrys(id);
			model.addAttribute("list", list);
			model.addAttribute("lists", lists);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping(value="/delete")
	public String delete(Model model,@RequestParam(value="id")int id
			){
		try {
			int i = appInfoService.delete(id);
			List<edoc_category> list=appInfoService.selectCategory();
			List<edoc_entry> lists=appInfoService.selectEntry();
			model.addAttribute("i", i);
			model.addAttribute("list", list);
			model.addAttribute("lists", lists);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping(value="/updateq")
	public String update(HttpServletRequest request,
						@RequestParam(value="id")int id){
		edoc_entry edoc = appInfoService.s(id);
		request.setAttribute("bb", edoc);
		return "update";
	}
	@RequestMapping(value="/updates")
	public String updates(HttpServletRequest request,
						@RequestParam(value="id")int id,
						@RequestParam(value="title")String title,
						@RequestParam(value="summary")String summary,
						@RequestParam(value="uploaduser")String uploaduser,
						@RequestParam(value="createdate")String createdate){
		try {
			System.out.println("修改开始");
			int i = appInfoService.update(id, title, summary, uploaduser, createdate);
			System.out.println(i);
			if(i==1){
				List<edoc_category> list=appInfoService.selectCategory();
				List<edoc_entry> lists=appInfoService.selectEntry();
				request.setAttribute("list", list);
				request.setAttribute("lists", lists);
			}else{
			i=0;
			}
			request.setAttribute("o", i);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
	@RequestMapping(value="/insert")
	public String insert(HttpServletRequest request){
		return "insert";
	}
	@RequestMapping(value="/inserts")
	public String inserts(HttpServletRequest request,	
						@RequestParam(value="title")String title,
						@RequestParam(value="summary")String summary,
						@RequestParam(value="uploaduser")String uploaduser,
						@RequestParam(value="createdate")String createdate){
		try {
			int i = appInfoService.insert(3, title, summary, uploaduser, createdate);
			System.out.println(i);
			if(i==1){
				List<edoc_category> list=appInfoService.selectCategory();
				List<edoc_entry> lists=appInfoService.selectEntry();
				request.setAttribute("list", list);
				request.setAttribute("lists", lists);
			}else{
			i=0;
			}
			request.setAttribute("q", i);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}
//	@RequestMapping(value="/insertid")
//	public String insertid(HttpServletRequest request,
//						@RequestParam(value="id")String proId){
//		System.out.println(proId);
//		try {
//			request.setAttribute("id", proId);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "insert";
//	}
//	@RequestMapping(value="/insert")
//	public String insert(HttpServletRequest request,
//						@RequestParam(value="id")int proId,
//						@RequestParam(value="name")String executor,
//						@RequestParam(value="miao")String description,
//						@RequestParam(value="ji")int orderLevel,
//						  String createDate){
//		try {
//			String datestr= new Date().toString();
//			Date date=new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(datestr);
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//			createDate=sdf.format(date);
//			if(executor!=null&&executor!=""&&description!=null&&description!=""){
//			int i = appInfoService.insert(proId, executor, description, orderLevel, createDate);
//			System.out.println(i);
//			if(i==1){
//			List<workorder> list=appInfoService.Select();
//			request.setAttribute("list", list);
//			}else{
//			i=0;
//			}
//			request.setAttribute("i", i);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "select";
//	}
//	@RequestMapping(value="/select")
//	public String select(Model model){
//		try {
//			List<workorder> list=appInfoService.Select();
//			model.addAttribute("list", list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "select";
//	}
//	@RequestMapping(value="/select")
//	public String selectId(HttpServletRequest request,@RequestParam(value="id")Integer id){
//		System.out.println(id);
//		try {
//			bookInfo list=appInfoService.Showid(id);
//			request.setAttribute("list", list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "select";
//	}
//	@RequestMapping(value="/insert")
//	public String insertTypes(HttpServletRequest request,
//			@RequestParam(value="bookCode")String bookCode,
//			@RequestParam(value="bookName")String bookName,
//			@RequestParam(value="tname")int bookType,
//			@RequestParam(value="bookAuthor")String bookAuthor,
//			@RequestParam(value="publishPress")String publishPress,
//			@RequestParam(value="ublishDate")String ublishDate,
//			@RequestParam(value="borrowed")int borrowed,
//			@RequestParam(value="createdBy")String createdBy,
//			String creationTime){
//		String datestr= new Date().toString();
//		Date date;
//		try {
//			date = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(datestr);
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//			creationTime=sdf.format(date);
//				int i=appInfoService.insertInfo(bookCode, bookName, bookType, bookAuthor, publishPress, ublishDate, borrowed, createdBy, creationTime);
//				List<bookInfo> list=appInfoService.Show(null);
//				request.setAttribute("list", list);
//				request.setAttribute("i", i);
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//		}		
//		return "index";
//	}
//	@RequestMapping(value="/insertType")
//	public String inserts(HttpServletRequest request){
//		try {
//			List<book_type> list=appInfoService.ShowType();
//			request.setAttribute("list", list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "insert";
//	}
//	@RequestMapping(value="/upd")
//	public String update(HttpServletRequest request,@RequestParam("id")int id){
//		try {
//			System.out.println(id);
//			List<book_type> list=appInfoService.ShowType();
//			bookInfo bb=appInfoService.Showid(id);
//			request.setAttribute("bb", bb);
//			request.setAttribute("list", list);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return "update";
//	}
//	@RequestMapping(value="/update")
//	public String updatesa(HttpServletRequest request,
//			@RequestParam("ids")Integer id,
//			@RequestParam("bookCode")String bookCode,
//			@RequestParam("bookName")String bookName,
//			@RequestParam("tname")int bookType,
//			@RequestParam("bookAuthor")String bookAuthor,
//			@RequestParam("publishPress")String publishPress,
//			@RequestParam("ublishDate")String ublishDate,
//			@RequestParam("borrowed")int borrowed,
//			@RequestParam("createdBy")String createdBy,
//			String lastUpdatetime) throws ParseException{
//			System.out.println("______________________"+id);
//			String datestr= new Date().toString();
//			Date date=new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.UK).parse(datestr);
//			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//			lastUpdatetime=sdf.format(date);
//			int o = appInfoService.updateInfo(id, bookCode, bookName, bookType, bookAuthor, publishPress, ublishDate, borrowed, createdBy, lastUpdatetime);
//			if(o==1){
//			request.setAttribute("o", o);
//			}else{
//				return "redirect:/manager/upd";
//			}
//		return "index";
//	}
//
//
//	@RequestMapping(value="del",method=RequestMethod.GET)
//	public String deleteSq(HttpServletRequest request,@RequestParam int id){
//		logger.debug("getAppCategoryList pid ============ " + id);
//		int s = 0;		
//		List<bookInfo> list = null;
//		try {
//		    list=appInfoService.Show(null);
//			s = appInfoService.dele(id);
//			request.setAttribute("list", list);
//			request.setAttribute("s", s);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return "index";
//	}
	/*@RequestMapping(value="/login",)
	public String login(Model model,@RequestParam String date,@RequestParam String cName,@RequestParam String mName){		
		return "index";
	}*/
	
	/*@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public String doLogin(@RequestParam String userCode,@RequestParam String userPassword,HttpServletRequest request,HttpSession session){
		logger.debug("doLogin====================================");
		//调用service方法，进行用户匹配
		BackendUser user = null;
		try {
			user = backendUserService.login(userCode,userPassword);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(null != user){//登录成功
			//放入session
			session.setAttribute(Constants.USER_SESSION, user);
			//页面跳转（main.jsp）
			return "redirect:/manager/backend/main";
		}else{
			//页面跳转（login.jsp）带出提示信息--转发
			request.setAttribute("error", "用户名或密码不正确");
			return "backendlogin";
		}
	}
	
	@RequestMapping(value="/backend/main")
	public String main(HttpSession session){
		if(session.getAttribute(Constants.USER_SESSION) == null){
			return "redirect:/manager/login";
		}
		return "backend/main";
	}
	
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		//清除session
		session.removeAttribute(Constants.USER_SESSION);
		return "backendlogin";
	}*/
}
