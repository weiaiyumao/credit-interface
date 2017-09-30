package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * CvsFilePathDomain 对象
 * @author ChuangLan
 *
 */
public class CvsFilePathDomain implements Serializable{

	private static final long serialVersionUID = -8341959716843462358L;

	private String id;
	
	private String thereFilePath;
	
	private String thereFileSize;
	
	private String thereCount;
	
	private String sixFilePath;
	
	private String sixFileSize;
	
	private String sixCount;
	
	private String unknownFilePath; 
	
	private String unknownFileSize;
	
	private String unknownSize;
	
	private String zipName;
	
	private String zipPath;
	
	private String zipSize;
	
	private String userId;
	
	private Date createTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThereFilePath() {
		return thereFilePath;
	}

	public void setThereFilePath(String thereFilePath) {
		this.thereFilePath = thereFilePath;
	}

	public String getSixFilePath() {
		return sixFilePath;
	}

	public void setSixFilePath(String sixFilePath) {
		this.sixFilePath = sixFilePath;
	}

	public String getUnknownFilePath() {
		return unknownFilePath;
	}

	public void setUnknownFilePath(String unknownFilePath) {
		this.unknownFilePath = unknownFilePath;
	}
	
	public String getZipPath() {
		return zipPath;
	}

	public void setZipPath(String zipPath) {
		this.zipPath = zipPath;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getZipSize() {
		return zipSize;
	}

	public void setZipSize(String zipSize) {
		this.zipSize = zipSize;
	}

	public String getThereFileSize() {
		return thereFileSize;
	}

	public void setThereFileSize(String thereFileSize) {
		this.thereFileSize = thereFileSize;
	}

	public String getSixFileSize() {
		return sixFileSize;
	}

	public void setSixFileSize(String sixFileSize) {
		this.sixFileSize = sixFileSize;
	}

	public String getUnknownFileSize() {
		return unknownFileSize;
	}

	public void setUnknownFileSize(String unknownFileSize) {
		this.unknownFileSize = unknownFileSize;
	}

	public String getThereCount() {
		return thereCount;
	}

	public void setThereCount(String thereCount) {
		this.thereCount = thereCount;
	}

	public String getSixCount() {
		return sixCount;
	}

	public void setSixCount(String sixCount) {
		this.sixCount = sixCount;
	}

	public String getUnknownSize() {
		return unknownSize;
	}

	public void setUnknownSize(String unknownSize) {
		this.unknownSize = unknownSize;
	}

	public String getZipName() {
		return zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
	}
	
	
}
