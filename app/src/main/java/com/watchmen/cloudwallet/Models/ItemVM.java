package com.watchmen.cloudwallet.Models;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root
public class ItemVM extends VMBase {
    @Attribute
    public String Title;
    @Attribute
    public String Content;
}
