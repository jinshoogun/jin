<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<html>
<head>
<body>
	<center>
		<font size="6" color="green"> ī��ȸ�� ���Խ�û���Դϴ�. �ۼ����ּ���! <br />
	</center>

<form action="insert.do" method="post" name ="userinput" onSubmit="return checkIt()">
	<table border="1" align="center" >
			<%-- �� ������� insert.jsp�� post�������� ������ �ϰ� �˴ϴ�. �̶� return(���ԿϷ� ��ư�� ������)�Ǳ� ������ function checkIt()�޼ҵ�� ���� ���� ���θ�
			Ȯ���� �ϰ� ���ǿ� �´� ��� false�� ���� ���� �˶��� �߻���Ű�� ������  true�� �����ϰ� �ȴٸ�  submit�� �ϰ� �Ǿ� insert.jsp�� ������ ������ �ϰ� �ȴ�.--%>
			<tr>
				<td><center>
						���̵�<br /> (6�� �̻� ��������)
					</center></td>
				<td><input type="text" name=id /> 
				<input type="button" value="�ߺ�Ȯ��" name=idch OnClick="openConfirmid(this.form)" /> 
					<%-- ���̵��� �ߺ����θ� üũ�ϱ� ���ؼ�  ���������� openConfirmid �޼ҵ带 �����Ѵ�. --%>
				</td>
			</tr>
			<td><center>
					��й�ȣ<br /> (6�� �̻� ��������)
				</center></td>
			<td><input type="password" name=pw /></td>
			</tr>
			<td><center>
					��й�ȣ Ȯ�� <br />(�ѹ��� �Է����ּ���)
				</center></td>
			<td><input type="password" name=pw1 /> <input type="button"
				value="�ߺ�Ȯ��" name=pwch OnClick="openConfirmpw(this.form)" /></td>
			<%-- ��й�ȣ�� �ùٸ��� �ۼ����θ� Ȯ���Ѵ�. ��Ŭ���� ���� openConfirmpw function �޼ҵ�� �Ѿ�� �ȴ�. --%>
			</tr>
			<td><center>�̸�</center></td>
			<td><input type="text" name=na /></td>
			</tr>
			<td><center>����</center></td>
			<td><input type="radio" name="a" value="����" />���� <input
				type="radio" name="a" value="����" />����</td>
			</tr>
			<td><center>�ּ�</center></td>
			<td><textarea rows="2" , cols="50" name="add"></textarea></td>
			</tr>
			<td><center>�޴��� �Ǵ� ��ȭ��ȣ</center></td>
			<td><select name="phfirst">
					<option>010</option>
					<option>011</option>
					<option>016</option>
					<option>017</option>
					<option>018</option>
					<option>019</option>
					<option>02</option>
					<option>051</option>
					<option>053</option>
					<option>032</option>
					<option>062</option>
					<option>042</option>
					<option>052</option>
					<option>044</option>
					<option>031</option>
					<option>033</option>
					<option>043</option>
					<option>041</option>
					<option>063</option>
					<option>061</option>
					<option>054</option>
					<option>055</option>
					<option>064</option>
					<option>����</option>
			</select> - <input type="text" size="5" name=phsec /> - <input type="text"
				size="5" name=phthr /></td>

			</tr>
			<td><center>�̸��� �ּ�</center></td>
			<td><input type="text" name="mailId" /> @ <input type="text"
				name="domain" /> <select name="domain1">
					<option>�����Է�</option>
					<option>naver.com</option>
					<option>nate.com</option>
					<option>daum.net</option>
					<option>hanmail.net</option>
					<option>gmail.com</option>
					<option>outlook.com</option>
			</select></td>

			</tr>
			<td><center>�̸��� ���� ����</center></td>
			<td><input type="radio" name="b" value="����" />Y <input
				type="radio" name="b" vaule="����" />N</td>
			</tr>
			<td><center>
					�г��� ����<br /> (2�� �̻� ��������)
				</center></td>
			<td><input type="text" name="nick" /> <input type="button"
				value="�ߺ�Ȯ��" name="nich" OnClick="openConfirmnick(this.form)"/></td>
	        <%-- �г����� �ߺ����θ� �ִ��� Ȯ���� �ϴ� ��ư�̴�. �׷��� ��Ŭ���� ���� openConfirmnick function �޼ҵ�� �Ѿ�� �ȴ�. --%>
			</tr>
			<td><center>
					�Ұ���<br /> (10�� �̻� ��������)
				</center></td>
			<td><textarea rows="10" , cols="50" name="intru"></textarea></td>
			</tr>
			<td colspan="2"><center>
					<input type="submit" value="Ȯ��" name="com" /> <input type="reset"
						value="�ʱ�ȭ" name="reset" />
					<%-- submit�� �̸� Ȯ�ι�ư�� ����� �Ͽ��� ������ ��ҹ�ư�� button���� ����Ͽ��� mainȭ������ ���ƿ��� �˴ϴ�. 
				����, �ʱ�ȭ ��ư���� ��� ������ �����ϰ� ����ϴ�.--%>
					<input type="button" value="���"
						onclick="javascript:location.href='main.do'"/>
					<%-- ������ �ϴٰ� ����ϸ� �ڷ� main.jsp�� ���ƿɴϴ� --%>
		</form>
		</center>
		</td>
		</tr>
		</form>
	</table>
</body>
</html>