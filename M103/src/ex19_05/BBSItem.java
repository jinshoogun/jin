package ex19_05;
// 기본형과 직렬화 가능  클래스 타입의 필드는 모두 직렬화 가능합니다.
// Object는 java.io.Serializable 인터페이스를 구현하지 않기 때문에 직렬화 가능 클래스가 아닙니다.

public class BBSItem implements java.io.Serializable { //게시물 클래스
	static int itemNum = 0; // 게시물의 수 - 정적 필드는 직렬화 대상이 되지 않습니다. 직렬화 되는데 차단은 건거니 에러 발생 X
	String writer; // 글쓴이 : 인스턴스 필드는 직렬화 대상이 됩니다.
	transient String passwd; // 패스워드 - transient 키워드 붙은 인스턴스 필드는 직렬화 대상이 되지 않습니다.직렬화 되는데 차단은 건거니 에러 발생 X
	String title;   // 제목 - 인스턴스 필드는 직렬화 대상이 됩니다.
    String content; // 내용  - 인스턴스 필드는 직렬화 대상이 됩니다.
    Object addAttachment; // 첨부파일 - 직렬화 대상이 아닙니다. (직렬화자체가 되지 않으므로 에러 발생!)
    BBSItem(String wrier, String passwd, String title, String content){
    	 this.writer = wrier;
    	 this.passwd = passwd;
    	 this.title = title;
    	 this.content = content;
    	 itemNum++;
     }
     void modifyContent(String content, String passwd) {
    	 if (!passwd.equals(this.passwd))
    		 return;
    	 this.content = content;
     }
     void addAttachment(Object addAttachment) {
    	 this.addAttachment = addAttachment;
     }

}
