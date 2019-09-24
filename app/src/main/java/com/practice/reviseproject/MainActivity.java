package com.practice.reviseproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.practice.reviseproject.AlertDialog.AlertDialogActivity;
import com.practice.reviseproject.AndroidPermission.AndroidPermissionActivity;
import com.practice.reviseproject.AutoCompleteTextView.AutoCompleteTextViewActivity;
import com.practice.reviseproject.BottomNavigationView.BottomNavigationActivity;
import com.practice.reviseproject.BroadCastReceivers.activities.CustomBroadCastReceiverActivity;
import com.practice.reviseproject.BroadCastReceivers.activities.ExplicitBroadcastActivity;
import com.practice.reviseproject.BroadCastReceivers.activities.OrderedBroadCastReceiverActivity;
import com.practice.reviseproject.BroadCastReceivers.prabeesh.PrabeeshActivity;
import com.practice.reviseproject.CheckBox.CheckBoxActivity;
import com.practice.reviseproject.CollapsingToolbar.CollapseTitleActivity;
import com.practice.reviseproject.CollapsingToolbar.CollapsingToolbarActivity;
import com.practice.reviseproject.ConnectedNotwork.NetworkCheckingActivity;
import com.practice.reviseproject.ConnectedNotwork.Prabesh78.NetworkStatusActivity;
import com.practice.reviseproject.ContextualActionMode.ContextualAtionModeActivity;
import com.practice.reviseproject.FloatingContextualMenu.FloatingContextualMenuActivity;
import com.practice.reviseproject.GridLayout.GridLayoutActivity;
import com.practice.reviseproject.ListView.ListViewActivity;
import com.practice.reviseproject.ListView.ListView_With_Contextual_MenuActivity;
import com.practice.reviseproject.Navigation_Drawer.NavigationDrawerActivity;
import com.practice.reviseproject.PopupMenu.PopupMenuActivity;
import com.practice.reviseproject.Progressbar.ProgressbarActivity;
import com.practice.reviseproject.RadioButton.RadioButtonActivity;
import com.practice.reviseproject.Recyclerview.Mitch.MitchRecyclerviewActivity;
import com.practice.reviseproject.Recyclerview.Practice.RecyPracticeActivity;
import com.practice.reviseproject.Recyclerview.RecyclerviewActivity;
import com.practice.reviseproject.Recyclerview.Recyclerview_try1.Recyclerview_try1Activity;

import com.practice.reviseproject.Spinner.SpinnerActivity;
import com.practice.reviseproject.Sqlite.SqliteActivity;
import com.practice.reviseproject.TimePicker.TimePickerDialogShortActivity;
import com.practice.reviseproject.Viewpager.ImageSlider.ImageSliderActivity;
import com.practice.reviseproject.WelcomeIntroducer.Prabesh.WelcomeStartActivity;
import com.practice.reviseproject.WelcomeIntroducer.WelcomeIntro.WelcomeIntroducerActivity;
import com.practice.reviseproject.deta_with_retro.activities.SecondTryActivity;
import com.practice.reviseproject.menu.MenuActivity;
import com.practice.reviseproject.notification.NotificationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void menu(View view) {
        Intent intent= new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void CollapsingToolbar(View view) {
        Intent intent= new Intent(MainActivity.this, CollapseTitleActivity.class);
        startActivity(intent);
    }

    public void AutoCompleteTextView(View view) {
        Intent intent= new Intent(MainActivity.this, AutoCompleteTextViewActivity.class);
        startActivity(intent);
    }

    public void CheckBox(View view) {
        Intent intent= new Intent(MainActivity.this, CheckBoxActivity.class);
        startActivity(intent);
    }

    public void RadioButton(View view) {
        Intent intent= new Intent(MainActivity.this, RadioButtonActivity.class);
        startActivity(intent);
    }

    public void Spinner(View view) {
        Intent intent= new Intent(MainActivity.this, SpinnerActivity.class);
        startActivity(intent);
    }

    public void ListView(View view) {
        Intent intent= new Intent(MainActivity.this, ListViewActivity.class);
        startActivity(intent);
    }

    public void Recyclerview(View view) {
        Intent intent= new Intent(MainActivity.this, RecyclerviewActivity.class);
        startActivity(intent);
    }

    public void TimepickerDislaog(View view) {
        Intent intent= new Intent(MainActivity.this, TimePickerDialogShortActivity.class);
        startActivity(intent);
    }


    public void Floating_Contextual_Menu(View view) {
        Intent intent= new Intent(MainActivity.this, FloatingContextualMenuActivity.class);
        startActivity(intent);
    }

    public void Contextual_Action_Mode(View view) {
        Intent intent= new Intent(MainActivity.this, ContextualAtionModeActivity.class);
        startActivity(intent);
    }

    public void ListviewWithContextualMenu(View view) {
        Intent intent= new Intent(MainActivity.this, ListView_With_Contextual_MenuActivity.class);
        startActivity(intent);
    }

    public void Viewpager(View view) {
        Intent intent= new Intent(MainActivity.this, ImageSliderActivity.class);
        startActivity(intent);
    }

    public void AlertDialog(View view) {
        Intent intent= new Intent(MainActivity.this, AlertDialogActivity.class);
        startActivity(intent);
    }

    public void Navigation(View view) {
        Intent intent= new Intent(MainActivity.this, NavigationDrawerActivity.class);
        startActivity(intent);
    }

    public void AndroidPiermssion(View view) {
        Intent intent= new Intent(MainActivity.this, AndroidPermissionActivity.class);
        startActivity(intent);
    }

    public void BottomNav(View view) {
        Intent intent= new Intent(MainActivity.this, BottomNavigationActivity.class);
        startActivity(intent);
    }

    public void Gridlayout(View view) {
        Intent intent= new Intent(MainActivity.this, GridLayoutActivity.class);
        startActivity(intent);
    }

    public void NetworkChecking(View view) {
        Intent intent= new Intent(MainActivity.this, NetworkCheckingActivity.class);
        startActivity(intent);
    }

    public void NetworkStstus(View view) {
        Intent intent= new Intent(MainActivity.this, NetworkStatusActivity.class);
        startActivity(intent);
    }

    public void PopupMenu(View view) {
        Intent intent= new Intent(MainActivity.this, PopupMenuActivity.class);
        startActivity(intent);
    }

    public void progressbar(View view) {

        Intent intent= new Intent(MainActivity.this, ProgressbarActivity.class);
        startActivity(intent);
    }

    public void Mitchrecy(View view) {
        Intent intent= new Intent(MainActivity.this, MitchRecyclerviewActivity.class);
        startActivity(intent);
    }

    public void Tryrecy(View view) {
        Intent intent= new Intent(MainActivity.this, Recyclerview_try1Activity.class);
        startActivity(intent);
    }

    public void WelcomeIntroducer(View view) {

        Intent intent= new Intent(MainActivity.this, WelcomeIntroducerActivity.class);
        startActivity(intent);
    }

    public void SQlite(View view) {
        Intent intent= new Intent(MainActivity.this, SqliteActivity.class);
        startActivity(intent);
    }

    public void PracRecy(View view) {
        Intent intent= new Intent(MainActivity.this, RecyPracticeActivity.class);
        startActivity(intent);
    }

    public void Intro(View view) {
        Intent intent= new Intent(MainActivity.this, WelcomeStartActivity.class);
        startActivity(intent);
    }

    public void DataWithRetro(View view) {
        Intent intent= new Intent(MainActivity.this, SecondTryActivity.class);
        startActivity(intent);
    }

    public void Notification(View view) {

        Intent intent= new Intent(MainActivity.this, NotificationActivity.class);
        startActivity(intent);
    }

    public void BroadCastReceiver(View view) {
        Intent intent= new Intent(MainActivity.this, OrderedBroadCastReceiverActivity.class);
        startActivity(intent);
    }

    public void Incoming_Call_BroadCastReceiver(View view) {

        Intent intent= new Intent(MainActivity.this, PrabeeshActivity.class);
        startActivity(intent);
    }


}
