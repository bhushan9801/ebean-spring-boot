package com.helios.ebean

import com.helios.ebean.domains.AppUser
import io.ebean.EbeanServer
import org.springframework.stereotype.Service

@Service
class AppService(val ebeanServer: EbeanServer) {
    fun getUsers(): List<AppUser> {
        return ebeanServer.createQuery(AppUser::class.java).findList()
    }
}
