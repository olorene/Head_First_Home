package com.company.JsoapNext;
import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;

import java.io.IOException;

public class TortugaLogin {
    public static void main(String[] args) throws IOException {
        // # Constants used in this example
        final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.103 Safari/537.36";
//        final String LOGIN_FORM_URL = "https://http://tortuga-gamestable.top//admin";
//        final String USERNAME = "Lordus";
//        final String PASSWORD = "vorlon2258";
        final String LOGIN_FORM_URL = "https://github.com/login";
        final String USERNAME = "ggarik83@gmail.com";
        final String PASSWORD = "_Menmbar3155";

// # Go to login page
        Response loginFormResponse = Jsoup.connect(LOGIN_FORM_URL)
                .method(Connection.Method.GET)
                .userAgent(USER_AGENT)
                .execute();

        FormElement loginForm = (FormElement)loginFormResponse.parse()
                .select("div#login > form").first();

        System.out.println(loginForm);

/*

// # Fill the login form
// ## Find the form first...
        FormElement loginForm = (FormElement)loginFormResponse.parse()
                .select("div#login > form").first();
        checkElement("Login Form", loginForm);

// ## ... then "type" the username ...
        Element loginField = loginForm.select("#login_field").first();
        checkElement("Login Field", loginField);
        loginField.val(USERNAME);

// ## ... and "type" the password
        Element passwordField = loginForm.select("#password").first();
        checkElement("Password Field", passwordField);
        passwordField.val(PASSWORD);


// # Now send the form for login
        Connection.Response loginActionResponse = loginForm.submit()
                .cookies(loginFormResponse.cookies())
                .userAgent(USER_AGENT)
                .execute();

        System.out.println(loginActionResponse.parse().html());

*/

    }
    public static void checkElement(String name, Element elem) {
        if (elem == null) {
            throw new RuntimeException("Unable to find " + name);
        }
    }
}

