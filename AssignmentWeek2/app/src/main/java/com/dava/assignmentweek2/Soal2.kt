package com.dava.assignmentweek2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val Poppins = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
    Font(R.font.poppins_bold, FontWeight.Bold)
)

private val FieldBackground = Color(0xFFDCEEFC)
private val CardBackground = Color(0xFF2C2A4A)

@Composable
fun Soal2View() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF0B0B2A),
                        Color(0xFF1B2A52),
                        Color(0xFF2E5A54)
                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .fillMaxWidth()
                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                .background(CardBackground)
                .padding(horizontal = 24.dp, vertical = 28.dp)
        ) {
            Text(
                text = "My Travel",
                color = Color.White,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "Aurora",
                color = Color.White,
                fontFamily = Poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp
            )
            Text(
                text = "Tromsø, Norway",
                color = Color(0xFFC7C7D9),
                fontFamily = Poppins,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(6.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = "★★★★★",
                    color = Color(0xFFFFC542),
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "5.0",
                    color = Color.White,
                    fontFamily = Poppins,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            var reviewQ1 by remember { mutableStateOf("") }
            var reviewQ2 by remember { mutableStateOf("") }
            var reviewQ3 by remember { mutableStateOf("") }

            TravelTextField(
                value = reviewQ1,
                onValueChange = { reviewQ1 = it },
                placeholder = "What did you enjoy most about your trip?"
            )
            Spacer(modifier = Modifier.height(12.dp))
            TravelTextField(
                value = reviewQ2,
                onValueChange = { reviewQ2 = it },
                placeholder = "What was your favorite spot?"
            )
            Spacer(modifier = Modifier.height(12.dp))
            TravelTextField(
                value = reviewQ3,
                onValueChange = { reviewQ3 = it },
                placeholder = "Anything else you'd like to add?"
            )

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                FloatingActionButton(
                    onClick = {},
                    containerColor = FieldBackground,
                    contentColor = CardBackground
                ) {
                    Text(text = "+", fontSize = 24.sp, fontFamily = Poppins, fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .width(80.dp)
                        .height(4.dp)
                        .clip(RoundedCornerShape(50))
                        .background(Color(0xFF6B6B85))
                )
            }
        }
    }
}

@Composable
private fun TravelTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        placeholder = {
            Text(
                text = placeholder,
                fontFamily = Poppins,
                fontSize = 13.sp,
                color = Color(0xFF6B7A99)
            )
        },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(14.dp),
        singleLine = true,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = FieldBackground,
            unfocusedContainerColor = FieldBackground,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            focusedTextColor = CardBackground,
            unfocusedTextColor = CardBackground
        )
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Soal2Preview() {
    Soal2View()
}