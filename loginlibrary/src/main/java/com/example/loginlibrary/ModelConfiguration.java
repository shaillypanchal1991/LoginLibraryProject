package com.example.loginlibrary;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelConfiguration implements Parcelable
{
   private int userNameHeight=0;
   private int userNameWidth=0;
   private int passwordHeight=0;
   private int passwordWidth=0;
   private int loginButtonHeight =0;
   private int loginButtonWidth=0;
   private int userNameStockWidth=0;
   private int passwordStockWidth=0;
   private int loginButtonStockWidth=0;
   private String userNameColor="";
   private String passwordColor="";
   private String ButtonColor="";
   private int userNameCornerRadius=0;
   private int passwordCornerRadius=0;
   private int loginButtonCornerRadius=0;


   public ModelConfiguration() {

   }

   protected ModelConfiguration(Parcel in) {
       userNameHeight = in.readInt();
       userNameWidth = in.readInt();
       passwordHeight = in.readInt();
       passwordWidth = in.readInt();
       loginButtonHeight = in.readInt();
       loginButtonWidth = in.readInt();
       userNameStockWidth = in.readInt();
       passwordStockWidth = in.readInt();
       loginButtonStockWidth = in.readInt();
       userNameColor = in.readString();
       passwordColor = in.readString();
       ButtonColor = in.readString();
       userNameCornerRadius = in.readInt();
       passwordCornerRadius = in.readInt();
       loginButtonCornerRadius = in.readInt();
   }

   public static final Creator<ModelConfiguration> CREATOR = new Creator<ModelConfiguration>() {
       @Override
       public ModelConfiguration createFromParcel(Parcel in) {
           return new ModelConfiguration(in);
       }

       @Override
       public ModelConfiguration[] newArray(int size) {
           return new ModelConfiguration[size];
       }
   };

   public int getUserNameStockWidth() {
       return userNameStockWidth;
   }

   public void setUserNameStockWidth(int userNameStockWidth) {
       this.userNameStockWidth = userNameStockWidth;
   }

   public int getPasswordStockWidth() {
       return passwordStockWidth;
   }

   public void setPasswordStockWidth(int passwordStockWidth) {
       this.passwordStockWidth = passwordStockWidth;
   }

   public int getLoginButtonStockWidth() {
       return loginButtonStockWidth;
   }

   public void setLoginButtonStockWidth(int loginButtonStockWidth) {
       this.loginButtonStockWidth = loginButtonStockWidth;
   }

   public String getUserNameColor() {
       return userNameColor;
   }

   public void setUserNameColor(String userNameColor) {
       this.userNameColor = userNameColor;
   }

   public String getPasswordColor() {
       return passwordColor;
   }

   public void setPasswordColor(String passwordColor) {
       this.passwordColor = passwordColor;
   }

   public String getButtonColor() {
       return ButtonColor;
   }

   public void setButtonColor(String buttonColor) {
       ButtonColor = buttonColor;
   }

   public int getUserNameCornerRadius() {
       return userNameCornerRadius;
   }

   public void setUserNameCornerRadius(int userNameCornerRadius) {
       this.userNameCornerRadius = userNameCornerRadius;
   }

   public int getPasswordCornerRadius() {
       return passwordCornerRadius;
   }

   public void setPasswordCornerRadius(int passwordCornerRadius) {
       this.passwordCornerRadius = passwordCornerRadius;
   }

   public int getLoginButtonCornerRadius() {
       return loginButtonCornerRadius;
   }

   public void setLoginButtonCornerRadius(int loginButtonCornerRadius) {
       this.loginButtonCornerRadius = loginButtonCornerRadius;
   }


   public int getUserNameHeight() {
       return userNameHeight;
   }

   public void setUserNameHeight(int userNameHeight) {
       this.userNameHeight = userNameHeight;
   }

   public int getUserNameWidth() {
       return userNameWidth;
   }

   public void setUserNameWidth(int userNameWidth) {
       this.userNameWidth = userNameWidth;
   }

   public int getPasswordHeight() {
       return passwordHeight;
   }

   public void setPasswordHeight(int passwordHeight) {
       this.passwordHeight = passwordHeight;
   }

   public int getPasswordWidth() {
       return passwordWidth;
   }

   public void setPasswordWidth(int passwordWidth) {
       this.passwordWidth = passwordWidth;
   }

   public int getLoginButtonHeight() {
       return loginButtonHeight;
   }

   public void setLoginButtonHeight(int loginButtonHeight) {
       this.loginButtonHeight = loginButtonHeight;
   }

   public int getLoginButtonWidth() {
       return loginButtonWidth;
   }

   public void setLoginButtonWidth(int loginButtonWidth) {
       this.loginButtonWidth = loginButtonWidth;
   }

   @Override
   public int describeContents() {
       return 0;
   }

   @Override
   public void writeToParcel(Parcel parcel, int i) {
       parcel.writeInt(userNameHeight);
       parcel.writeInt(userNameWidth);
       parcel.writeInt(passwordHeight);
       parcel.writeInt(passwordWidth);
       parcel.writeInt(loginButtonHeight);
       parcel.writeInt(loginButtonWidth);
       parcel.writeInt(userNameStockWidth);
       parcel.writeInt(passwordStockWidth);
       parcel.writeInt(loginButtonStockWidth);
       parcel.writeString(userNameColor);
       parcel.writeString(passwordColor);
       parcel.writeString(ButtonColor);
       parcel.writeInt(userNameCornerRadius);
       parcel.writeInt(passwordCornerRadius);
       parcel.writeInt(loginButtonCornerRadius);
   }
}
