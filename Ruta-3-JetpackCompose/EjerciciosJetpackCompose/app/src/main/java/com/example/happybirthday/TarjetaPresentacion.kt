package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class BusinessCardActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFE3F2FD),
                ) {
                    BusinessCard(
                        name = "Julio Daniel",
                        job = "Android Developer",
                        phone = "+51 966 127 027",
                        email = "jdaniel@gmail.com",
                        username = "@JDaniel"
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    job: String,
    phone: String,
    email: String,
    username: String
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        ProfileInfo(
            name = name,
            job = job
        )

        Spacer(
            modifier = Modifier.height(50.dp)
        )

        ContactInfo(
            phone = phone,
            email = email,
            username = username
        )
    }
}

@Composable
fun ProfileInfo(
    name: String,
    job: String
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "Android logo",
            modifier = Modifier.size(120.dp)
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Text(
            text = name,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF176B5B)
        )

        Spacer(
            modifier = Modifier.height(4.dp)
        )

        Text(
            text = job,
            fontSize = 18.sp,
            color = Color(0xFF455A64)
        )
    }
}

@Composable
fun ContactInfo(
    phone: String,
    email: String,
    username: String
) {
    Column(
        horizontalAlignment = Alignment.Start
    ) {

        ContactItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "Phone",
                    tint = Color(0xFF176B5B),
                    modifier = Modifier.size(24.dp)
                )
            },
            text = phone
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        ContactItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email",
                    tint = Color(0xFF176B5B),
                    modifier = Modifier.size(24.dp)
                )
            },
            text = email
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        ContactItem(
            icon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Username",
                    tint = Color(0xFF176B5B),
                    modifier = Modifier.size(24.dp)
                )
            },
            text = username
        )
    }
}

@Composable
fun ContactItem(
    icon: @Composable () -> Unit,
    text: String
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        icon()

        Spacer(
            modifier = Modifier.size(12.dp)
        )

        Text(
            text = text,
            fontSize = 16.sp,
            color = Color(0xFF263238)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    HappyBirthdayTheme {
        BusinessCard(
            name = "Julio Daniel",
            job = "Android Developer",
            phone = "+51 966 127 027",
            email = "jdaniel@gmail.com",
            username = "@JDaniel"
        )
    }
}
