package edwinbaltazar.example.monadasglamor.Common

import edwinbaltazar.example.monadasglamor.Remote.IMyApi
import edwinbaltazar.example.monadasglamor.Remote.RetrofitClient

object Common {

    val BASE_URL="http://192.168.1.221:3000/"

    val api: IMyApi
        get() = RetrofitClient.getClient(BASE_URL).create(IMyApi::class.java)
}