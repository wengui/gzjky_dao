package com.gzjky.dao.constant;

/**
 * CODE定数类
 * 
 * @author yuting
 */
public interface CodeConstant {
	/**
	 * 历史
	 */
	String HISTORY_TYPE = "0";

	/**
	 * 警告
	 */
	String WARN_TYPE = "1";

	/**
	 * 正常
	 */
	String HISTORY_TYPE_STATUS = "Normal";

	/**
	 * 异常
	 */
	String WARN_TYPE_STATUS = "Danger";
	
	/**
	 * 数据:无
	 */
	String DATA_NOTHING = "0";

	/**
	 * 数据:有
	 */
	String DATA_HAVING = "1";
	
	/**
	 * 高血压
	 */
	int DISEASE_TYPE1 = 1;
	/**
	 * 高血脂
	 */
	int DISEASE_TYPE2 = 2;
	/**
	 * 糖尿病
	 */
	int DISEASE_TYPE3 = 3;
	/**
	 * 冠心病
	 */
	int DISEASE_TYPE4 = 4;
	/**
	 * 脑血管意外
	 */
	int DISEASE_TYPE5 = 5;
	
	/**
	 * 高血压
	 */
	String DISEASE_NAME1 = "高血压";
	/**
	 * 高血脂
	 */
	String DISEASE_NAME2 = "高血脂";
	/**
	 * 糖尿病
	 */
	String DISEASE_NAME3 = "糖尿病";
	/**
	 * 冠心病
	 */
	String DISEASE_NAME4 = "冠心病";
	/**
	 * 脑血管意外
	 */
	String DISEASE_NAME5 = "脑血管意外";
	
	/**
	 * 处理成功
	 */
	int SUCCESS_STATUS = 1;
	
	/**
	 * 亲情号码最多只能设置3个
	 */
	int FAIL_STATUS = 2;
	
	/**
	 * 亲情号已存在
	 */
	int EXIT_STATUS = 3;
	
	/**
	 * 咨询:已提交
	 */
	String COMMIT_INQUIRY = "1";
	
	/**
	 * 咨询:已完成
	 */
	String FINISH_INQUIRY = "2";
}
