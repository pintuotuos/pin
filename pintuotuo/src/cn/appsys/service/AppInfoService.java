package cn.appsys.service;

import java.util.Date;
import java.util.List;




















import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.Flight_Tickets;
import cn.appsys.pojo.Flights;
import cn.appsys.pojo.bookInfo;
import cn.appsys.pojo.book_type;
import cn.appsys.pojo.edoc_category;
import cn.appsys.pojo.edoc_entry;
import cn.appsys.pojo.project;
import cn.appsys.pojo.workorder;


public interface AppInfoService {
	
	public edoc_entry s(@Param(value="id")int id);
	public List<edoc_category> selectCategory();
	public List<edoc_entry> selectEntrys(int id);
	public List<edoc_entry> selectEntry();
	public int delete(int id);
	public int update(@Param(value="id")int id,
			@Param(value="title")String title,
			@Param(value="summary")String summary,
			@Param(value="uploaduser")String uploaduser,
			@Param(value="createDate") String createDate);
	public int insert(@Param(value="id")int id,
			@Param(value="title")String title,
			@Param(value="summary")String summary,
			@Param(value="uploaduser")String uploaduser,
			@Param(value="createDate") String createDate);
}
	
//	public List<project> Show();
//	public int insert(@Param("projectId")int proId,
//			  @Param("executor")String executor,
//			  @Param("description")String description,
//			  @Param("orderLevel")int orderLevel,
//			  @Param("createDate")String createDate);
//	public List<workorder> Select();
//}
//	/**
//	 * update Sale Status By AppId and Operator
//	 * @param appId
//	 * @return
//	 * @throws Exception
//	 */
//	public List<bookInfo> Show(@Param("name")String name);
//	public List<Flight_Tickets> selectTick(int id)throws Exception;
//	public List<Flights> selectFilght(String dd, String cName, String mName) throws Exception;
//	public int dele(int id);
//	public bookInfo Showid(Integer id);
//	public List<book_type> ShowType();
//	public int insertInfo(@Param("bookCode")String bookCode,
//			  @Param("bookName")String bookName,
//			  @Param("bookType")int bookType,
//			  @Param("bookAuthor")String bookAuthor,
//			  @Param("publishPress")String publishPress,
//			  @Param("ublishDate")String ublishDate,
//			  @Param("borrowed")int borrowed,
//			  @Param("createdBy")String createdBy,
//			  @Param("creationTime")String creationTime);
//	public int updateInfo(@Param("id")int id,
//			@Param("bookCode")String bookCode,
//			  @Param("bookName")String bookName,
//			  @Param("bookType")int bookType,
//			  @Param("bookAuthor")String bookAuthor,
//			  @Param("publishPress")String publishPress,
//			  @Param("ublishDate")String ublishDate,
//			  @Param("borrowed")int borrowed,
//			  @Param("createdBy")String createdBy,
//			  @Param("lastUpdatetime")String lastUpdatetime);
//}
