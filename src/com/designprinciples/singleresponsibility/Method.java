package com.designprinciples.singleresponsibility;

public class Method {
//    public void updateUserInfo ( String userName, String address ) {
//        userName = "Tom";
//        address = "Melbourne";
//    }
//
//    public void updateUserInfo ( String userName, String... properties ) {
//        userName = "Tom";
//        // ...
//    }


//Method Split Principle
//    public void updateUserName ( String userName ) {
//        userName = "Tom";
//    }
//
//    public void updateUserAddress ( String address ) {
//        address = "Melbourne";
//    }

//    public void updateUserInfo ( String userName, String address, boolean bool) {
//        if(bool){
//            userName = "Tom";
//            address = "Melbourne";
//        }
//        else{
//            userName = "Jack";
//            address = "Sydney";
//        }
//    }
//Split By bool
    public void updateUserInfoBool1 ( String userName, String address ) {
        userName = "Tom";
        address = "Melbourne";
    }

    public void updateUserInfoBool2 ( String userName, String address ) {
        userName = "Jack";
        address = "Sydney";
    }

}
