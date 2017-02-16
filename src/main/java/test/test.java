package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by replay on 2017. 2. 14..
 */
public class test {

    public static void main(String[] args) {
        URL url = null;
        URLConnection urlConnection = null;

        // URL 주소
        String sUrl = "http://localhost:8080/getmean";

        // 파라미터 이름
        String paramName = "wordList";

        // 파라미터 이름에 대한 값
        String paramValue = "{\"action\":\"word_mean\",\"url\":\"www.w3schools.com\",\"wordlist\":[{\"word\":\"w\",\"count\":2},{\"word\":\"schools\",\"count\":2},{\"word\":\"com\",\"count\":2},{\"word\":\"HTMLCSSMORE\",\"count\":2},{\"word\":\"AJAX\",\"count\":6},{\"word\":\"Database\",\"count\":3},{\"word\":\"Example\",\"count\":5},{\"word\":\"PreviousNext\",\"count\":3},{\"word\":\"can\",\"count\":3},{\"word\":\"be\",\"count\":5},{\"word\":\"used\",\"count\":2},{\"word\":\"for\",\"count\":4},{\"word\":\"interactive\",\"count\":2},{\"word\":\"communication\",\"count\":2},{\"word\":\"with\",\"count\":4},{\"word\":\"a\",\"count\":13},{\"word\":\"database\",\"count\":4},{\"word\":\"The\",\"count\":9},{\"word\":\"following\",\"count\":3},{\"word\":\"example\",\"count\":3},{\"word\":\"will\",\"count\":2},{\"word\":\"demonstrate\",\"count\":2},{\"word\":\"how\",\"count\":2},{\"word\":\"web\",\"count\":2},{\"word\":\"page\",\"count\":3},{\"word\":\"fetch\",\"count\":2},{\"word\":\"information\",\"count\":2},{\"word\":\"from\",\"count\":2},{\"word\":\"CustomerID\",\"count\":2},{\"word\":\"NORTS\",\"count\":2},{\"word\":\"CompanyName\",\"count\":2},{\"word\":\"North\",\"count\":2},{\"word\":\"South\",\"count\":3},{\"word\":\"ContactName\",\"count\":2},{\"word\":\"Simon\",\"count\":2},{\"word\":\"Crowther\",\"count\":2},{\"word\":\"Address\",\"count\":2},{\"word\":\"House\",\"count\":2},{\"word\":\"Queensbridge\",\"count\":2},{\"word\":\"City\",\"count\":2},{\"word\":\"London\",\"count\":2},{\"word\":\"PostalCode\",\"count\":2},{\"word\":\"SW\",\"count\":2},{\"word\":\"RZ\",\"count\":2},{\"word\":\"Country\",\"count\":2},{\"word\":\"UK\",\"count\":2},{\"word\":\"Try\",\"count\":2},{\"word\":\"it\",\"count\":2},{\"word\":\"Yourself\",\"count\":2},{\"word\":\"Explained\",\"count\":2},{\"word\":\"showCustomer\",\"count\":6},{\"word\":\"Function\",\"count\":2},{\"word\":\"When\",\"count\":2},{\"word\":\"user\",\"count\":2},{\"word\":\"selects\",\"count\":2},{\"word\":\"customer\",\"count\":3},{\"word\":\"in\",\"count\":7},{\"word\":\"the\",\"count\":14},{\"word\":\"dropdown\",\"count\":3},{\"word\":\"list\",\"count\":3},{\"word\":\"above\",\"count\":3},{\"word\":\"function\",\"count\":7},{\"word\":\"called\",\"count\":4},{\"word\":\"is\",\"count\":8},{\"word\":\"executed\",\"count\":3},{\"word\":\"triggered\",\"count\":2},{\"word\":\"by\",\"count\":5},{\"word\":\"onchange\",\"count\":2},{\"word\":\"event\",\"count\":2},{\"word\":\"str\",\"count\":4},{\"word\":\"var\",\"count\":2},{\"word\":\"xhttp\",\"count\":6},{\"word\":\"if\",\"count\":4},{\"word\":\"document\",\"count\":3},{\"word\":\"getElementById\",\"count\":3},{\"word\":\"txtHint\",\"count\":3},{\"word\":\"innerHTML\",\"count\":3},{\"word\":\"return\",\"count\":2},{\"word\":\"new\",\"count\":2},{\"word\":\"XMLHttpRequest\",\"count\":3},{\"word\":\"onreadystatechange\",\"count\":2},{\"word\":\"this\",\"count\":5},{\"word\":\"readyState\",\"count\":2},{\"word\":\"status\",\"count\":2},{\"word\":\"responseText\",\"count\":2},{\"word\":\"open\",\"count\":2},{\"word\":\"GET\",\"count\":2},{\"word\":\"getcustomer\",\"count\":4},{\"word\":\"asp\",\"count\":4},{\"word\":\"q\",\"count\":4},{\"word\":\"true\",\"count\":2},{\"word\":\"send\",\"count\":2},{\"word\":\"does\",\"count\":2},{\"word\":\"Check\",\"count\":2},{\"word\":\"selected\",\"count\":2},{\"word\":\"Create\",\"count\":3},{\"word\":\"an\",\"count\":4},{\"word\":\"object\",\"count\":2},{\"word\":\"to\",\"count\":7},{\"word\":\"when\",\"count\":2},{\"word\":\"server\",\"count\":6},{\"word\":\"response\",\"count\":7},{\"word\":\"ready\",\"count\":2},{\"word\":\"Send\",\"count\":2},{\"word\":\"request\",\"count\":3},{\"word\":\"off\",\"count\":2},{\"word\":\"file\",\"count\":4},{\"word\":\"on\",\"count\":3},{\"word\":\"Notice\",\"count\":2},{\"word\":\"that\",\"count\":2},{\"word\":\"parameter\",\"count\":2},{\"word\":\"added\",\"count\":2},{\"word\":\"URL\",\"count\":2},{\"word\":\"content\",\"count\":3},{\"word\":\"of\",\"count\":4},{\"word\":\"Server\",\"count\":5},{\"word\":\"Page\",\"count\":2},{\"word\":\"JavaScript\",\"count\":7},{\"word\":\"ASP\",\"count\":3},{\"word\":\"could\",\"count\":2},{\"word\":\"easily\",\"count\":2},{\"word\":\"rewritten\",\"count\":2},{\"word\":\"PHP\",\"count\":8},{\"word\":\"or\",\"count\":2},{\"word\":\"some\",\"count\":2},{\"word\":\"other\",\"count\":2},{\"word\":\"languages\",\"count\":2},{\"word\":\"Look\",\"count\":2},{\"word\":\"at\",\"count\":2},{\"word\":\"corresponding\",\"count\":2},{\"word\":\"source\",\"count\":2},{\"word\":\"code\",\"count\":2},{\"word\":\"runs\",\"count\":2},{\"word\":\"query\",\"count\":2},{\"word\":\"against\",\"count\":2},{\"word\":\"and\",\"count\":8},{\"word\":\"returns\",\"count\":2},{\"word\":\"result\",\"count\":2},{\"word\":\"HTML\",\"count\":11},{\"word\":\"table\",\"count\":4},{\"word\":\"expires\",\"count\":2},{\"word\":\"sql\",\"count\":5},{\"word\":\"SELECT\",\"count\":2},{\"word\":\"FROM\",\"count\":2},{\"word\":\"CUSTOMERS\",\"count\":2},{\"word\":\"WHERE\",\"count\":2},{\"word\":\"CUSTOMERID\",\"count\":2},{\"word\":\"querystring\",\"count\":2},{\"word\":\"set\",\"count\":3},{\"word\":\"conn\",\"count\":5},{\"word\":\"CreateObject\",\"count\":3},{\"word\":\"ADODB\",\"count\":3},{\"word\":\"Connection\",\"count\":2},{\"word\":\"Provider\",\"count\":2},{\"word\":\"Microsoft\",\"count\":2},{\"word\":\"Jet\",\"count\":2},{\"word\":\"OLEDB\",\"count\":2},{\"word\":\"Open\",\"count\":3},{\"word\":\"Mappath\",\"count\":2},{\"word\":\"datafolder\",\"count\":2},{\"word\":\"northwind\",\"count\":2},{\"word\":\"mdb\",\"count\":2},{\"word\":\"rs\",\"count\":6},{\"word\":\"recordset\",\"count\":2},{\"word\":\"write\",\"count\":5},{\"word\":\"do\",\"count\":2},{\"word\":\"until\",\"count\":2},{\"word\":\"EOF\",\"count\":2},{\"word\":\"each\",\"count\":2},{\"word\":\"x\",\"count\":4},{\"word\":\"Fields\",\"count\":2},{\"word\":\"tr\",\"count\":3},{\"word\":\"td\",\"count\":5},{\"word\":\"b\",\"count\":3},{\"word\":\"name\",\"count\":2},{\"word\":\"value\",\"count\":2},{\"word\":\"next\",\"count\":2},{\"word\":\"MoveNext\",\"count\":2},{\"word\":\"loop\",\"count\":2},{\"word\":\"COLOR\",\"count\":2},{\"word\":\"PICKER\",\"count\":2},{\"word\":\"LEARN\",\"count\":2},{\"word\":\"MORE\",\"count\":2},{\"word\":\"Tabs\",\"count\":2},{\"word\":\"Dropdowns\",\"count\":2},{\"word\":\"Accordions\",\"count\":2},{\"word\":\"Convert\",\"count\":2},{\"word\":\"Weights\",\"count\":2},{\"word\":\"Animated\",\"count\":2},{\"word\":\"Buttons\",\"count\":2},{\"word\":\"Side\",\"count\":2},{\"word\":\"Navigation\",\"count\":3},{\"word\":\"Top\",\"count\":5},{\"word\":\"JS\",\"count\":2},{\"word\":\"Animations\",\"count\":2},{\"word\":\"Modal\",\"count\":2},{\"word\":\"Boxes\",\"count\":2},{\"word\":\"Progress\",\"count\":2},{\"word\":\"Bars\",\"count\":2},{\"word\":\"Login\",\"count\":2},{\"word\":\"Form\",\"count\":2},{\"word\":\"Includes\",\"count\":2},{\"word\":\"Google\",\"count\":2},{\"word\":\"Maps\",\"count\":2},{\"word\":\"Loaders\",\"count\":2},{\"word\":\"Tooltips\",\"count\":2},{\"word\":\"Slideshow\",\"count\":2},{\"word\":\"Filter\",\"count\":2},{\"word\":\"List\",\"count\":3},{\"word\":\"Sort\",\"count\":2},{\"word\":\"SHARE\",\"count\":2},{\"word\":\"CERTIFICATES\",\"count\":2},{\"word\":\"CSS\",\"count\":10},{\"word\":\"jQuery\",\"count\":6},{\"word\":\"Bootstrap\",\"count\":4},{\"word\":\"XML\",\"count\":5},{\"word\":\"Read\",\"count\":2},{\"word\":\"More\",\"count\":2},{\"word\":\"REPORT\",\"count\":2},{\"word\":\"ERROR\",\"count\":2},{\"word\":\"PRINT\",\"count\":2},{\"word\":\"PAGE\",\"count\":2},{\"word\":\"FORUM\",\"count\":2},{\"word\":\"ABOUT\",\"count\":2},{\"word\":\"Tutorials\",\"count\":3},{\"word\":\"Tutorial\",\"count\":11},{\"word\":\"W\",\"count\":6},{\"word\":\"SQL\",\"count\":2},{\"word\":\"Angular\",\"count\":3},{\"word\":\"References\",\"count\":2},{\"word\":\"Reference\",\"count\":8},{\"word\":\"Browser\",\"count\":2},{\"word\":\"Statistics\",\"count\":2},{\"word\":\"Colors\",\"count\":2},{\"word\":\"Character\",\"count\":2},{\"word\":\"Sets\",\"count\":2},{\"word\":\"AngularJS\",\"count\":2},{\"word\":\"Examples\",\"count\":13},{\"word\":\"DOM\",\"count\":2},{\"word\":\"Web\",\"count\":2},{\"word\":\"Certificates\",\"count\":2},{\"word\":\"Certificate\",\"count\":8},{\"word\":\"Schools\",\"count\":2},{\"word\":\"optimized\",\"count\":2},{\"word\":\"learning\",\"count\":2},{\"word\":\"testing\",\"count\":2},{\"word\":\"training\",\"count\":2},{\"word\":\"might\",\"count\":2},{\"word\":\"simplified\",\"count\":2},{\"word\":\"improve\",\"count\":2},{\"word\":\"reading\",\"count\":2},{\"word\":\"basic\",\"count\":2},{\"word\":\"understanding\",\"count\":2},{\"word\":\"references\",\"count\":2},{\"word\":\"examples\",\"count\":2},{\"word\":\"are\",\"count\":2},{\"word\":\"constantly\",\"count\":2},{\"word\":\"reviewed\",\"count\":2},{\"word\":\"avoid\",\"count\":2},{\"word\":\"errors\",\"count\":2},{\"word\":\"but\",\"count\":2},{\"word\":\"we\",\"count\":2},{\"word\":\"cannot\",\"count\":2},{\"word\":\"warrant\",\"count\":2},{\"word\":\"full\",\"count\":2},{\"word\":\"correctness\",\"count\":2},{\"word\":\"all\",\"count\":2},{\"word\":\"While\",\"count\":2},{\"word\":\"using\",\"count\":2},{\"word\":\"site\",\"count\":2},{\"word\":\"you\",\"count\":2},{\"word\":\"agree\",\"count\":2},{\"word\":\"have\",\"count\":2},{\"word\":\"read\",\"count\":2},{\"word\":\"accepted\",\"count\":2},{\"word\":\"our\",\"count\":2},{\"word\":\"terms\",\"count\":2},{\"word\":\"use\",\"count\":2},{\"word\":\"cookie\",\"count\":2},{\"word\":\"privacy\",\"count\":2},{\"word\":\"policy\",\"count\":2},{\"word\":\"Copyright\",\"count\":2},{\"word\":\"Refsnes\",\"count\":2},{\"word\":\"Data\",\"count\":2},{\"word\":\"All\",\"count\":2},{\"word\":\"Rights\",\"count\":2},{\"word\":\"Reserved\",\"count\":2},{\"word\":\"Powered\",\"count\":2}]}";


        try {


            // Post방식으로 전송 하기
            url = new URL(sUrl);
            urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);

            printByOutputStream(urlConnection.getOutputStream(), paramName + "=" + paramValue);
            printByInputStream(urlConnection.getInputStream());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 웹 서버로 부터 받은 웹 페이지 결과를 콘솔에 출력하는 메소드
    public static void printByInputStream(InputStream is) {
        byte[] buf = new byte[1024];
        int len = -1;

        try {
            while ((len = is.read(buf, 0, buf.length)) != -1) {
                System.out.write(buf, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 웹 서버로 파라미터명과 값의 쌍을 전송하는 메소드
    public static void printByOutputStream(OutputStream os, String msg) {
        try {
            byte[] msgBuf = msg.getBytes("UTF-8");
            os.write(msgBuf, 0, msgBuf.length);
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}