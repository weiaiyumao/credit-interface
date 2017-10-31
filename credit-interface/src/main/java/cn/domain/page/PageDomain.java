package main.java.cn.domain.page;

import java.util.List;

public class PageDomain<T> {

	private List<T> tlist;
	
	private int currentPage; // 当前页

	private int numPerPage; // 每页显示多行
	
	private int totalPages; // 总页数

	/**
	 * @return the tlist
	 */
	public List<T> getTlist() {
		return tlist;
	}

	/**
	 * @param tlist the tlist to set
	 */
	public void setTlist(List<T> tlist) {
		this.tlist = tlist;
	}

	/**
	 * @return the numPerPage
	 */
	public int getNumPerPage() {
		return numPerPage;
	}

	/**
	 * @param numPerPage the numPerPage to set
	 */
	public void setNumPerPage(int numPerPage) {
		this.numPerPage = numPerPage;
	}

	/**
	 * @return the totalPages
	 */
	public int getTotalPages() {
		return totalPages;
	}

	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	
	
	

}
