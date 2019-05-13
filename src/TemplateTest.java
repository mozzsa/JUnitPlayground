import org.junit.*;

public class TemplateTest extends TestRules {


    @Test
    public void test1() {

        System.out.println("1 I am test 1");
        Assert.assertTrue(false);
    }

    @Test
    public void test2() {
        Template template = new Template();
        Assert.assertNotNull(template);
    }

    @Test
    public void test3() {
        String s = "your test .....";
        int score1 = 90;
        int score2 = 190;
        Template template = new Template(s);
        Assert.assertNotNull(template.renderTemplate(score1, score2));
    }


    @Test
    public void test4() {
        String s = "your test .....";
        int score1 = 90;
        int score2 = 190;
        Template template = new Template(s);
        String expectedMsg = s + score1 + score2;
        Assert.assertEquals(expectedMsg, template.renderTemplate(score1, score2));
    }

    @Test(expected = Exception.class)
    public void test5() {
        String s = "your tes .....";
        int score1 = 90;
        int score2 = 190;
        Template template = new Template(null);
        String expectedMsg = s + score1 + score2;
        Assert.assertEquals(expectedMsg, template.renderTemplate(score1, score2));
    }

}
