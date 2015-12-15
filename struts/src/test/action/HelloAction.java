package test.action;

public class HelloAction {
	private String msg;
	public void setMsg(String msg){
		this.msg = msg;
	}
	public String execute() { // 자바의 main 메소오오오드 
		//test 메소오드를 호출하고 싶을 경우? web.xml action name="hello" class="test.action.HelloAction" method ="test">를 추가 작업 실시하면 됩니다.
		//System.out.println("execute"); - 컨트롤러로 돌아갔기 때문에 인터셉터만 프린터 된 상태이다
		System.out.println("execute");
		return "success"; // return을 넣어야 되고 기본값 success로 되어야 합니다.
		// 경로값 미작성 struts.xml에서 작성
		// return 이름을 바꾸고 싶을 경우? web.xml <result name = "ok">를 추가 작업 실시하면 됩니다.
	}
	public String getMsg(){
	 return msg;	
	}
	public int getNum(){
		return 100;
	}
}
