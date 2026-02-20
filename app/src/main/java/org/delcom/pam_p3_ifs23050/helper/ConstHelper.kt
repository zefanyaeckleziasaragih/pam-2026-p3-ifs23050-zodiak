package org.delcom.pam_p3_ifs23050.helper

class ConstHelper {
    // Route Names
    enum class RouteNames(val path: String) {
        Home(path = "home"),
        Profile(path = "profile"),
        Zodiac(path = "zodiac"),
        ZodiacDetail(path = "zodiac/{name}"),
    }
}