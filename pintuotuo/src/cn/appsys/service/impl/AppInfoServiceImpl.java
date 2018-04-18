package cn.appsys.service.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import cn.appsys.dao.backenduser.BackendUserMapper;
import cn.appsys.pojo.Flight_Tickets;
import cn.appsys.pojo.Flights;
import cn.appsys.pojo.bookInfo;
import cn.appsys.pojo.book_type;
import cn.appsys.pojo.edoc_category;
import cn.appsys.pojo.edoc_entry;
import cn.appsys.pojo.project;
import cn.appsys.pojo.workorder;
import cn.appsys.service.AppInfoService;

@Service
public class AppInfoServiceImpl implements AppInfoService {
	@Resource
	private BackendUserMapper mapper;
//
//	@Override
//	public List<project> Show(){
//		// TODO Auto-generated method stub
//	 return mapper.Show();
//	}
//
//	@Override
//	public int insert(int projectId, String executor, String description,
//			int orderLevel, String createDate) {
//		// TODO Auto-generated method stub
//		return mapper.insert(projectId, executor, description, orderLevel, createDate);
//	}
//
//	@Override
//	public List<workorder> Select() {
//		// TODO Auto-generated method stub
//		return mapper.Select();
//	}
//

	@Override
	public List<edoc_category> selectCategory() {
		// TODO Auto-generated method stub
		return mapper.selectCategory();
	}
public List<edoc_entry> selectEntrys(int id) {
	// TODO Auto-generated method stub
	return mapper.selectEntrys(id);
}
@Override
public List<edoc_entry> selectEntry() {
	// TODO Auto-generated method stub
	return mapper.selectEntry();
}
@Override
public int delete(int id) {
	// TODO Auto-generated method stub
	return mapper.delete(id);
}
@Override
public int update(int id, String title, String summary, String uploaduser,
		String createDate) {
	// TODO Auto-generated method stub
	return mapper.update(id, title, summary, uploaduser, createDate);
}
@Override
public edoc_entry s(int id) {
	// TODO Auto-generated method stub
	return mapper.s(id);
}
@Override
public int insert(int id, String title, String summary, String uploaduser,
		String createDate) {
	// TODO Auto-generated method stub
	return mapper.insert(id, title, summary, uploaduser, createDate);
}

//	@Override
//	public List<Flight_Tickets> selectTick(int id) throws Exception {
//		// TODO Auto-generated method stub
//		return mapper.selectTick(id);
//	}
//
//	@Override
//	public List<Flights> selectFilght(String t1, String cName, String mName) throws Exception {
//		// TODO Auto-generated method stub
//		return mapper.selectFilght(t1, cName, mName);
//	}
//	public List<book_type> ShowType(){
//		return mapper.ShowType();
//	}
//	@Override
//	public List<bookInfo> Show(String name) {
//		// TODO Auto-generated method stub
//		return mapper.Show(name);
//	}
//
//	@Override
//	public bookInfo Showid(Integer id) {
//		// TODO Auto-generated method stub
//		return mapper.Showid(id);
//	}
//
//	@Override
//	public int dele(int id) {
//		// TODO Auto-generated method stub
//		return mapper.dele(id);
//	}
//
//	@Override
//	public int insertInfo(String bookCode, String bookName, int bookType,
//			String bookAuthor, String publishPress, String ublishDate,
//			int borrowed, String createdBy, String creationTime) {
//		// TODO Auto-generated method stub
//		return mapper.insertInfo(bookCode, bookName, bookType, bookAuthor, publishPress, ublishDate, borrowed, createdBy, creationTime);
//	}
//
//	@Override
//	public int updateInfo(int id, String bookCode, String bookName,
//			int bookType, String bookAuthor, String publishPress,
//			String ublishDate, int borrowed, String createdBy,
//			String lastUpdatetime) {
//		// TODO Auto-generated method stub
//		return mapper.updateInfo(id, bookCode, bookName, bookType, bookAuthor, publishPress, ublishDate, borrowed, createdBy, lastUpdatetime);
//	}

}
