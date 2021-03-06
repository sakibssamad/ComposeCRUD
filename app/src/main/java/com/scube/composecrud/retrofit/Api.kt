package com.scube.composecrud.retrofit

import com.scube.composecrud.model.Gender
import com.scube.composecrud.model.Role
import com.scube.composecrud.model.User
import io.reactivex.Single
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface API {


    @FormUrlEncoded
    @POST("UserApi")
    fun doInsert(
        @Field("requestCode") requestCode: String?,
        @Field("name") name: String?,
        @Field("mobile") mobile: String?,
        @Field("email") email: String?,
        @Field("dob") dob: String?,
        @Field("gender") gender: String?,
        @Field("address") address: String?,
        @Field("role") role: String?

    ): Single<User>



    @FormUrlEncoded
    @POST("UserApi")
    fun doGetAllRoleList(
        @Field("requestCode") requestCode: String?
    ): Single < List<Role>>

    @FormUrlEncoded
    @POST("UserApi")
    fun doGetGenderList(
        @Field("requestCode") requestCode: String?
    ): Single < List<Gender>>

    @FormUrlEncoded
    @POST("UserApi")
    fun doGetUserList(
        @Field("requestCode") requestCode: String?
    ): Single < List<User>>



}