package edwinbaltazar.example.monadasglamor.Remote

import edwinbaltazar.example.monadasglamor.Model.APIResponse
import retrofit2.http.Field
import  retrofit2.Call

import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface IMyApi {
    @FormUrlEncoded
    @POST("loginUser/login")
    fun loginUser(
            @Field("email")email:String,
            @Field("password")password: String
                    ):Call<APIResponse>
}