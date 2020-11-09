<%--
  Created by IntelliJ IDEA.
  User: yang-mac
  Date: 2020/11/04
  Time: 11:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<%
    //현재 도메인에 저장되어있는 모든 쿠키 가져오기
    Cookie []cookies=request.getCookies();
    boolean isLogin=false;//쿠키가 존재하면 true
    //저장된 쿠키가 하나도 없다면 null
    if(cookies!=null)
    {
        for(Cookie cook:cookies)
        {
            //쿠키이름 얻기
            String cookieName=cook.getName();
            //쿠키에 저장된 값 얻기
            String cookieValue=cook.getValue();
            System.out.println(cookieName+","+cookieValue);
            //loginok 라는 쿠키가 있고 값이 success가 들어있다면 성공적으로
            //로그인했다는 뜻(생성안된 상태서 널값일 경우 오류가 나기때문에
            //널 조건도 추가)
            if(cookieName.equals("loginok") && cookieValue!=null
                    && cookieValue.equals("success")){
                isLogin=true;
            }
        }
    }
%>
<body>
<%
    if (!isLogin) {
%>
<script type="text/javascript">
    alert("login first");
    // history.back();
    window.location.replace("cookiemain.jsp")
</script>
<%
//    response.sendRedirect("cookiemain.jsp");
} else {
%>
<pre>
"이기는 건 쉽다. 지는 건 절대 쉽지 않다. 네게는 그렇다."
이날 트럼프 대통령은 버지니아주 알링턴의 공화당 전국위원회 사무실에서 기자들을 만나 "우린
오늘 아주 훌륭한 밤을 맞을 것"이라며 이 같이 말했다.
대선 승리를 자신하지만, 패배시엔 이를 받아들이지 않고 불복할 수 있다는 뜻으로 풀이된다.
미국 경제방송 CNBC에 따르면 승리시 수락연설이나 패배시 승복연설을 준비했느냐는 질문에 트럼프
대통령은 "난 아직 승복이나 수락 연설을 생각하지 않고 있다"며 "둘 중 한 가지를 하게 되길
희망한다"고 말했다.
그는 자신의 최근 유세가 성공적이었다고 주장하며 "플로리다와 애리조나, 텍사스 주에서 우리가
아주 잘 하고 있다고 들었다"고 했다.
트럼프 대통령은 이날 밤 백악관 집무실인 오벌오피스에서 가족, 고위 참모들과 함께 개표 중계방송을
지켜볼 예정이라고 미국 지상파 NBC는 전했다.
</pre>
<%
    }
%>

</body>
</html>
