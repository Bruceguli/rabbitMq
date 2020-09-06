package com.example.gl.rabbit.lehuBase;

/**
 * Created by chenliangliang on 2017/10/15.
 */
public enum ApiCodeEnum {
	// 自定义
	SUCCESS(200, "成功"),
	ERROR_DETAIL(201,"请完善修改资料"),
	FIAL_LOGIN(201, "请完善认证资料!"),
	LOGIN_ERRO(202, "密码或账号错误!"),
	NAME_EXIST_ERRO(203, "该号码已被注册!"),
	//	NICKNAME_EXIST_ERRO(205, "号码已存在!"),material
	MATERIAL_ERRO(205, "新增内容已存在!"),
	ALBUM_EXIST_ERRO(205, "画册已存在!"),
	VITIFICATION_ERRO(204, "验证码错误"),
	PASSWORD_ERRO(204, "密码错误"),
	VITIFICATION_OUT_ERRO(206, "验证已失效"),
	VITIFICATION_TIME(207, "请一分钟以后再试"),
	COMMENT_ERRO(208, "评论次数过多"),
	REPEAT_NUM(209, "课程编号重复"),
	IS_LOGIN(210, "该账号已经登录"),
	NO_WX_LOGIN(211, "该微信账户未绑定"),
	NO_WB_LOGIN(212, "该微博账户未绑定"),
	NO_NUSER_NAME(213, "该号码未注册"),
	NO_BINDING(214, "第三方未确认"),

	DELECT(303, "删除失败"),
	FAILURE(-1, "失败"),
	UNKONW_ERROR(101, "服务器内部错误"),
	UNAUTHORITY(102, "未授权"),
	TOKEN_INVALID(103, "token无效"),
	PWD_MISTAKE(104, "账号或密码不正确"),
	PHONE_ERROR(105, "手机号重复"),
	NAME_ERROR(106, "名称重复"),
	USER_NAME_OR_PASSWORD_ERROR(108, "用户名或密码错误"),
	ACTIVE_ERROR(107, "该账号已被启用/禁用"),
	PROJECT_DELETE(108, "该项目下有商户，请先删除商户"),
	NO_VERIFICATION(109, "验证码已失效"),
	VERIFICATION_ERROR(110, "验证码错误"),
	EXCELNULL(1005, "导入的字段里有空值"),
	USER_NO_ITERATE(109, "员工号重复"),
	PERAMTYPE_ITERATE(110, "巡视类型已存在"),
	TEMPLATE_ITERATE(111, "模板名称已存在"),
	ID_ERROR(112, "ID错误"),
	PARAMETER_ITERATE(113, "参数名称已存在"),
	PARAMETER_ITERATE2(120, "标签名称已存在"),
	PARAMETERTYPE_ERROR(114, "文字化参数类型名称已存在"),
	EDITION_ITERATE(115, "地方模板已存在"),
	PATROL_NAME_ITERATE(116, "巡视名称已存在"),
	SECURITY_SAFETY(117, "安防点巡逻顺序错误"),
	SECURITY_SAFETY_MISS(118,"该安防订单下无此安防点"),
	SETTING_NAME_ITERATE(119, "维保计划名称已存在"),
	LOGIN_FAIL(120, "密码或账号错误!"),
	NOT_FOUND(404, "Not Found"),
	METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
	UNSUPPORTED_MEDIA_TYPE(415,"Unsupported Media Type"),
	NOT_ACCEPTABLE(406, "Not Acceptable"),
	INTERNAL_SERVER_ERROR(500,"失败"),
	BAD_REQUEST(400, "Bad Request"),
	SERVICE_UNAVAILABLE(503,"Service Unavailable"),
	USER_UNFIND(206, "操作失败,请联系管理员"),
	ROLE_NAME(123, "已有此角色"),
	ALBUM_ERROR(205,"画册已存在"),
	PASSWORD_REPEAT_ERRO(204, "新旧密码相同"),
	INTEGRAL_ERROR(205,"已签到"),
	MATERIAL_ERROR(205,"新增内容已存在"),
	WXOPENID_ERRO(205, "此微信已被其他用户绑定!"),
	USER_ERROR(206, "异常情况,请联系管理员!"),
	WBOPENID_ERRO(205, "此微博已被其他用户绑定!");
	private Integer code;
	private String message;

	ApiCodeEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}
