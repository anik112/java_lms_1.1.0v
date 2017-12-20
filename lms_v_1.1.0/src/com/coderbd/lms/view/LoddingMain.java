/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.lms.view;

/**
 *
 * @author anik
 */
public class LoddingMain {

    private static Lodding lodding;
    private static LoginForm loginForm;

    public static void main(String args[]) {

        loginForm = new LoginForm();
        lodding = new Lodding();
        lodding.setVisible(true);

        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(30);
                lodding.lblLod.setText(Integer.toString(i) + "%");
                lodding.progressBarLoding.setValue(i);
            }
            lodding.setVisible(false);
            loginForm.setVisible(true);
        } catch (Exception e) {
        }

    }

}
