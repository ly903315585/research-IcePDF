package org.icepdf.core.application;

public class ProductInfo 
{
    public static String COMPANY = "ICEsoft Technologies, Inc.";
    public static String PRODUCT = "ICEpdf-pro";
    public static String PRIMARY = "5";
    public static String SECONDARY = "0";
    public static String TERTIARY = "6";
    public static String RELEASE_TYPE = "P01";
    public static String BUILD_NO = "61";
    public static String REVISION = "";
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("\n");
      localStringBuilder.append(COMPANY);
      localStringBuilder.append("\n");
      localStringBuilder.append(PRODUCT);
      localStringBuilder.append(" ");
      localStringBuilder.append(PRIMARY);
      localStringBuilder.append(".");
      localStringBuilder.append(SECONDARY);
      localStringBuilder.append(".");
      localStringBuilder.append(TERTIARY);
      localStringBuilder.append(" ");
      localStringBuilder.append(RELEASE_TYPE);
      localStringBuilder.append("\n");
      localStringBuilder.append("Build number: ");
      localStringBuilder.append(BUILD_NO);
      localStringBuilder.append("\n");
      localStringBuilder.append("Revision: ");
      localStringBuilder.append(REVISION);
      localStringBuilder.append("\n");
      return localStringBuilder.toString();
    }
    
    public String getVersion()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      /*localStringBuilder.append(PRIMARY);
      localStringBuilder.append(".");
      localStringBuilder.append(SECONDARY);
      localStringBuilder.append(".");
      localStringBuilder.append(TERTIARY);
      localStringBuilder.append(" ");
      localStringBuilder.append(RELEASE_TYPE);*/
      
      //System.out.println("sadvsdiuvndsfknk");
      return localStringBuilder.toString();
    }
    
    public static void main(String[] paramArrayOfString)
    {
      ProductInfo localProductInfo = new ProductInfo();
      System.out.println(localProductInfo.toString());
    }
}