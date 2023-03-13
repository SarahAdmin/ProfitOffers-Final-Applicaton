package com.example.profitoffers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void EnterBasket (View view) {
        Intent basketIntent = new Intent(this, shoppingbasket.class);
        startActivity(basketIntent);
    }
    public void EnterAccount (View view) {
        Intent accountIntent = new Intent(this, SignIn.class);
        startActivity(accountIntent);
    }
    public void EnterMembership (View view) {
        Intent membershipIntent = new Intent(this, MembershipClub.class);
        startActivity(membershipIntent);
    }
    public void EnterLocation (View view) {
        Intent locationIntent = new Intent(this, BranchLocation.class);
        startActivity(locationIntent);
    }
    public void FeaturedPage (View view ) {
        Intent featuredProIntent = new Intent(this, FeaturedProducts.class);
        startActivity(featuredProIntent);
    }
    public void OfferPage (View view) {
        Intent DiscountIntent = new Intent(this, Promotions.class);
        startActivity(DiscountIntent);
    }
    public void ProductsPage (View view) {
        Intent ProIntent = new Intent(this, Products.class);
        startActivity(ProIntent);
    }
}