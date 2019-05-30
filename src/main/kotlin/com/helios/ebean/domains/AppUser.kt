package com.helios.ebean.domains

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "app_user")
data class AppUser(
    @Id
    @Column(name = "user_id")
    val userId: Int,
    @Column(name = "user_name")
    val userName: String

)
