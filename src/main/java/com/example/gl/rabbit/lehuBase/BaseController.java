package com.example.gl.rabbit.lehuBase;


/**
 * @packageName com.lehu.framework.controller
 * @className BaseController
 * @author LiTao
 * @time 10:37
 * @date 2019/5/27
 */
public class BaseController {

	protected final <T> ApiResult success() {
		return new ApiResult<T>(ApiCodeEnum.SUCCESS.getCode(), ApiCodeEnum.SUCCESS.getMessage());
	}

	protected final <T> ApiResult<T> success(final T data) {
		return new ApiResult<>(ApiCodeEnum.SUCCESS.getCode(), ApiCodeEnum.SUCCESS.getMessage(), data);
	}
	protected final <T> ApiResult<T> success(final T data,String message) {
		return new ApiResult<>(ApiCodeEnum.SUCCESS.getCode(), message, data);
	}
	protected final <T> ApiResult<T> passwordRepeat(final T data) {
		return new ApiResult<>(ApiCodeEnum.PASSWORD_REPEAT_ERRO.getCode(), ApiCodeEnum.PASSWORD_REPEAT_ERRO.getMessage(), data);
	}

	protected final <T> ApiResult<T> userError(final T data) {
		return new ApiResult<>(ApiCodeEnum.USER_UNFIND.getCode(), ApiCodeEnum.USER_UNFIND.getMessage(), data);
	}
	protected final <T> ApiResult<T> detailError(final T data) {
		return new ApiResult<>(ApiCodeEnum.ERROR_DETAIL.getCode(), ApiCodeEnum.ERROR_DETAIL.getMessage(), data);
	}

	protected final <T> ApiResult<T> userNameError(final T data) {
		return new ApiResult<>(ApiCodeEnum.PHONE_ERROR.getCode(), ApiCodeEnum.PHONE_ERROR.getMessage(), data);
	}

	protected final <T> ApiResult<T> delctError(final T data) {
		return new ApiResult<>(ApiCodeEnum.USER_UNFIND.getCode(), ApiCodeEnum.USER_UNFIND.getMessage(), data);
	}

	protected final <T> ApiResult<T> roleNameErro(final T data) {
		return new ApiResult<>(ApiCodeEnum.ROLE_NAME.getCode(), ApiCodeEnum.ROLE_NAME.getMessage(), data);
	}

	protected final <T> ApiResult<T> nameExistErro(final T data) {
		return new ApiResult<>(ApiCodeEnum.NAME_EXIST_ERRO.getCode(), ApiCodeEnum.NAME_EXIST_ERRO.getMessage(), data);
	}

	protected final <T> ApiResult<T> vitificationTimeErro() {
		return new ApiResult<>(ApiCodeEnum.VITIFICATION_TIME.getCode(), ApiCodeEnum.VITIFICATION_TIME.getMessage());
	}

	protected final <T> ApiResult<T> repeatErro() {
		return new ApiResult<>(ApiCodeEnum.REPEAT_NUM.getCode(), ApiCodeEnum.REPEAT_NUM.getMessage());
	}
	protected final <T> ApiResult<T> noBinding() {
		return new ApiResult<>(ApiCodeEnum.NO_BINDING.getCode(), ApiCodeEnum.NO_BINDING.getMessage());
	}

	protected final <T> ApiResult<T> commentErro() {
		return new ApiResult<>(ApiCodeEnum.COMMENT_ERRO.getCode(), ApiCodeEnum.COMMENT_ERRO.getMessage());
	}

//	protected final <T> ApiResult<T> nickNameExistErro(final T data) {
//		return new ApiResult<>(ApiCodeEnum.NICKNAME_EXIST_ERRO.getCode(), ApiCodeEnum.NICKNAME_EXIST_ERRO.getMessage(),
//				data);
//	}

	protected final <T> ApiResult<T> noUserName(final T data) {
		return new ApiResult<>(ApiCodeEnum.NO_NUSER_NAME.getCode(), ApiCodeEnum.NO_NUSER_NAME.getMessage(),
				data);
	}

	protected final <T> ApiResult<T> vitification(final T data) {
		return new ApiResult<>(ApiCodeEnum.VITIFICATION_ERRO.getCode(), ApiCodeEnum.VITIFICATION_ERRO.getMessage(),
				data);
	}

	protected final <T> ApiResult<T> PasswordError(final T data) {
		return new ApiResult<>(ApiCodeEnum.PASSWORD_ERRO.getCode(), ApiCodeEnum.PASSWORD_ERRO.getMessage(),
				data);
	}
	protected final <T> ApiResult<T> MaterialError(final T data) {
		return new ApiResult<>(ApiCodeEnum.MATERIAL_ERRO.getCode(), ApiCodeEnum.MATERIAL_ERRO.getMessage(),
				data);
	}

	protected final <T> ApiResult<T> vitificationOutTime(final T data) {
		return new ApiResult<>(ApiCodeEnum.VITIFICATION_OUT_ERRO.getCode(),
				ApiCodeEnum.VITIFICATION_OUT_ERRO.getMessage(), data);
	}

	protected final <T> ApiResult<T> loginErro(final T data) {
		return new ApiResult<>(ApiCodeEnum.LOGIN_ERRO.getCode(), ApiCodeEnum.LOGIN_ERRO.getMessage(), data);
	}

	protected final <T> ApiResult<T> noWxLogin() {
		return new ApiResult<>(ApiCodeEnum.NO_WX_LOGIN.getCode(), ApiCodeEnum.NO_WX_LOGIN.getMessage());
	}

	protected final <T> ApiResult<T> noWbLogin() {
		return new ApiResult<>(ApiCodeEnum.NO_WB_LOGIN.getCode(), ApiCodeEnum.NO_WB_LOGIN.getMessage());
	}

	protected final <T> ApiResult<T> isLogin(final T data) {
		return new ApiResult<>(ApiCodeEnum.IS_LOGIN.getCode(), ApiCodeEnum.IS_LOGIN.getMessage(), data);
	}

	protected final <T> ApiResult<T> failLogin(final T data) {
		return new ApiResult<>(ApiCodeEnum.FIAL_LOGIN.getCode(), ApiCodeEnum.FIAL_LOGIN.getMessage(), data);
	}

	protected final <T> ApiResult<T> error(final ApiCodeEnum apiCodeEnum, final T data) {
		return new ApiResult<>(apiCodeEnum.getCode(), apiCodeEnum.getMessage(), data);
	}

	protected final <T> ApiResult<T> addAlbumError() {
		return new ApiResult<>(ApiCodeEnum.ALBUM_EXIST_ERRO.getCode(), ApiCodeEnum.ALBUM_EXIST_ERRO.getMessage());
	}

	protected final ApiResult error(final String msg) {
		return new ApiResult(ApiCodeEnum.DELECT.getCode(), msg, msg);
	}

	protected final ApiResult integral_error(final String msg) {
		return new ApiResult(ApiCodeEnum.INTEGRAL_ERROR.getCode(), msg, msg);
	}

	protected final ApiResult album_error(final String msg) {
		return new ApiResult(ApiCodeEnum.ALBUM_ERROR.getCode(), msg, msg);
	}
	protected final ApiResult material_error() {
		return new ApiResult(ApiCodeEnum.MATERIAL_ERROR.getCode(), ApiCodeEnum.MATERIAL_ERROR.getMessage());
	}


	protected final <T> ApiResult<T> WxOpenIdName() {
		return new ApiResult<>(ApiCodeEnum.WXOPENID_ERRO.getCode(), ApiCodeEnum.WXOPENID_ERRO.getMessage());
	}
	protected final <T> ApiResult<T> WbOpenIdName() {
		return new ApiResult<>(ApiCodeEnum.WBOPENID_ERRO.getCode(), ApiCodeEnum.WBOPENID_ERRO.getMessage());
	}

	protected final ApiResult USER_ERROR(final String msg) {
		return new ApiResult(ApiCodeEnum.USER_ERROR.getCode(), msg, msg);
	}


	protected final <T> ApiResult<T> artLabelSuccess(String message,final T data) {
		return new ApiResult<>(ApiCodeEnum.SUCCESS.getCode(), message, data);
	}

	protected final ApiResult myErrorFree(final Integer code, final String msg,final String data) {
		return new ApiResult(code, msg, data);
	}

}
