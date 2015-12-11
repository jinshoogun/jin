 function checkIt() { 
	 inputForm=eval("document.inform");
   if(!inputForm.id.value){
     alert("아이디를 입력하세요..");
	 return false;
   }
   if(!inputForm.passwd.value){
     alert("아이디를 입력하세요..");
	 return false;
   }
 }

