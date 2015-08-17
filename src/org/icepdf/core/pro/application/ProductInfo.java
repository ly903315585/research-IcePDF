package org.icepdf.core.pro.application;

import java.io.PrintStream;

public class ProductInfo
{
  public static String a = "";
  public static String b = "";
  public static String c = "";
  public static String d = "";
  public static String e = "";
  public static String f = "";
  public static String g = "";
  public static String h = "";
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("\n");
    localStringBuilder.append(a);
    localStringBuilder.append("\n");
    localStringBuilder.append(b);
    localStringBuilder.append(" ");
    localStringBuilder.append(c);
    localStringBuilder.append("");
    localStringBuilder.append(d);
    localStringBuilder.append("");
    localStringBuilder.append(e);
    localStringBuilder.append(" ");
    localStringBuilder.append(f);
    localStringBuilder.append("\n");
    localStringBuilder.append("Build number: ");
    localStringBuilder.append(g);
    localStringBuilder.append("\n");
    localStringBuilder.append("Revision: ");
    localStringBuilder.append(h);
    localStringBuilder.append("\n");
    return localStringBuilder.toString();
  }
  
  public String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(c);
    localStringBuilder.append("");
    localStringBuilder.append(d);
    localStringBuilder.append("");
    localStringBuilder.append(e);
    localStringBuilder.append(" ");
    localStringBuilder.append(f);
    return localStringBuilder.toString();
  }
  
  public static void main(String[] paramArrayOfString)
  {
    ProductInfo localProductInfo = new ProductInfo();
    System.out.println(localProductInfo.toString());
  }
}
