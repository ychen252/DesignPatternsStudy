package com.designprinciples.openclose;

public interface ICourse {
    Integer getId ();

    String getName ();

    Double getPrice ();

//    new added feature shouldn't add here
//    create a derived class instead
//    Double getDiscountPrice ();
}
