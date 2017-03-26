package com.j2ee.service;

import java.util.List;







import com.j2ee.dao.IWechatDAO;
import com.j2ee.dao.WechatDAOImpl;
import com.j2ee.pojo.Wechat;
import com.j2ee.util.PageBean;

public class WechatService implements IWechatService{

	private IWechatDAO dao = new WechatDAOImpl();
	
	public PageBean<Wechat> queryForPage(int pageSize, int page)
	{

		String hql = "select count(*) from Wechat ";
		int count = dao.getCount(hql); // 鎬昏褰曟暟
		System.out.print(count);
		int totalPage = PageBean.countTotalPage(pageSize, count); // 鎬婚〉鏁�		
		int offset = PageBean.countOffset(pageSize, page); // 褰撳墠椤靛紑濮嬭褰�		
		int length = pageSize; // 姣忛〉璁板綍鏁�		
		int currentPage = PageBean.countCurrentPage(page);
		List<Wechat> list = dao.queryForPage("from Wechat ", offset, length); // 璇ュ垎椤电殑璁板綍
		PageBean<Wechat> pageBean = new PageBean<Wechat>();
		pageBean.setPageSize(pageSize);
		pageBean.setCurrentPage(currentPage);
		pageBean.setAllRow(count);
		pageBean.setTotalPage(totalPage);
		pageBean.setList(list);
		pageBean.init();
		return pageBean;
	}
	
	public Wechat queryWechatByID(Integer id) {
		Wechat wechat = this.dao.queryWechatByID(id);
		return wechat;
	}

	@Override
	public Wechat findWechatByName(String name) {
		// TODO Auto-generated method stub
		Wechat wechat = this.dao.findWechatByName(name);
		return null;
	}
	

}
