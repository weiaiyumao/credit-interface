package main.java.cn.domain.page;

import java.io.Serializable;

public class PageDto  implements Serializable{
	
	private static final long serialVersionUID = 4434986337130867138L;

	private Integer currentPage; // 当前页

	private Integer numPerPage; // 每页显示多行
	
	private Integer totalPages; // 总页数
	
	private Integer totalNumber; // 总条数



	/**
	 * @return the numPerPage
	 */
	public Integer getNumPerPage() {
		return numPerPage;
	}

	/**
	 * @param numPerPage the numPerPage to set
	 */
	public void setNumPerPage(Integer numPerPage) {
		this.numPerPage = numPerPage;
	}

	/**
	 * @return the totalPages
	 */
	public Integer getTotalPages() {
		return totalPages;
	}

	/**
	 * @param totalPages the totalPages to set
	 */
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	/**
	 * @return the currentPage
	 */
	public Integer getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the totalNumber
	 */
	public Integer getTotalNumber() {
		return totalNumber;
	}

	/**
	 * @param totalNumber the totalNumber to set
	 */
	public void setTotalNumber(Integer totalNumber) {
		this.totalNumber = totalNumber;
	}

	
	 public PageDto(Integer currentPage,Integer pageSize){
		 if(null==currentPage || currentPage<=0)currentPage=1;
		 if(null==pageSize || pageSize<=0)pageSize=10;
		 this.currentPage=(currentPage-1)*pageSize;
		 this.numPerPage=pageSize;
		 
	 }
    
	   public PageDto(){
		   
	    }

}
