package Style;

import java.sql.Timestamp;

public class DTO {
	
	//main
    private int num;
    private String Style_Photo;
    private String Style_Storename;
    private String Style_storeid;
    private String Style_Area;
    private String Style_Sex;
    private String Style_Style;
    private String Style_Price;
    private String Style_Choose;
    private String Style_Myself;
    private int Style_Ref;
    private String Style_Reply;
    private String Style_Nickname;
    
    //Reservation
    private int r_num;
    private String r_name;
    private String r_password;
    private String r_phone;
    private String r_style;
    private String r_subject;
    private String r_designer;
    private String r_store;
    private String r_date;
    private String r_start;
    private String r_end;
    private Timestamp r_reg_date;
    private String r_cost;
    private String r_id;
    
    
    private String storename;
    
    
   
	public String getR_id() {
		return r_id;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public String getStyle_storeid() {
		return Style_storeid;
	}
	public void setStyle_storeid(String style_storeid) {
		Style_storeid = style_storeid;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	//style
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getStyle_Photo() {
		return Style_Photo;
	}
	public void setStyle_Photo(String style_Photo) {
		Style_Photo = style_Photo;
	}
	public String getStyle_Storename() {
		return Style_Storename;
	}
	public void setStyle_Storename(String style_Storename) {
		Style_Storename = style_Storename;
	}
	public String getStyle_Area() {
		return Style_Area;
	}
	public void setStyle_Area(String style_Area) {
		Style_Area = style_Area;
	}
	public String getStyle_Sex() {
		return Style_Sex;
	}
	public void setStyle_Sex(String style_Sex) {
		Style_Sex = style_Sex;
	}
	public String getStyle_Style() {
		return Style_Style;
	}
	public void setStyle_Style(String style_Style) {
		Style_Style = style_Style;
	}
	public String getStyle_Price() {
		return Style_Price;
	}
	public void setStyle_Price(String style_Price) {
		Style_Price = style_Price;
	}
	public String getStyle_Choose() {
		return Style_Choose;
	}
	public void setStyle_Choose(String style_Choose) {
		Style_Choose = style_Choose;
	}
	public String getStyle_Myself() {
		return Style_Myself;
	}
	public void setStyle_Myself(String style_Myself) {
		Style_Myself = style_Myself;
	}
	public int getStyle_Ref() {
		return Style_Ref;
	}
	public void setStyle_Ref(int style_Ref) {
		Style_Ref = style_Ref;
	}
	public String getStyle_Reply() {
		return Style_Reply;
	}
	public void setStyle_Reply(String style_Reply) {
		Style_Reply = style_Reply;
	}
	public String getStyle_Nickname() {
		return Style_Nickname;
	}
	public void setStyle_Nickname(String style_Nickname) {
		Style_Nickname = style_Nickname;
	}
	
	
	
	
	//reservation
	
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_password() {
		return r_password;
	}
	public void setR_password(String r_password) {
		this.r_password = r_password;
	}
	public String getR_phone() {
		return r_phone;
	}
	public void setR_phone(String r_phone) {
		this.r_phone = r_phone;
	}
	public String getR_style() {
		return r_style;
	}
	public void setR_style(String r_style) {
		this.r_style = r_style;
	}
	public String getR_subject() {
		return r_subject;
	}
	public void setR_subject(String r_subject) {
		this.r_subject = r_subject;
	}
	public String getR_designer() {
		return r_designer;
	}
	public void setR_designer(String r_designer) {
		this.r_designer = r_designer;
	}
	public String getR_store() {
		return r_store;
	}
	public void setR_store(String r_store) {
		this.r_store = r_store;
	}
	public Timestamp getR_reg_date() {
		return r_reg_date;
	}
	public void setR_reg_date(Timestamp r_reg_date) {
		this.r_reg_date = r_reg_date;
	}
	public String getR_start() {
		return r_start;
	}
	public void setR_start(String r_start) {
		this.r_start = r_start;
	}
	public String getR_end() {
		return r_end;
	}
	public void setR_end(String r_end) {
		this.r_end = r_end;
	}
	public String getR_cost() {
		return r_cost;
	}
	public void setR_cost(String r_cost) {
		this.r_cost = r_cost;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	
    

}
