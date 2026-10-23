package mar.frias.classwork_examscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mar.frias.classwork_examscreen.ui.theme.Classwork_ExamScreenTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen(
    onBack: () -> Unit,
    onClickNav: (Int) -> Unit,
    onClickNotif: (Int) -> Unit,
    selectedItem: Int
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Notifications",
                        color = MaterialTheme.colorScheme.primary
                    )
                    },
                navigationIcon = {
                    IconButton(onClick = onBack) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = selectedItem == 1,
                    onClick = { onClickNav(1) },
                    icon = { Icon(Icons.Default.Info, contentDescription = "Anuncios") },
                    label = { Text("Anuncios") }
                )

                NavigationBarItem(
                    selected = selectedItem == 2,
                    onClick = { onClickNav(2) },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Inicio") },
                    label = { Text("Inicio") }
                )

                NavigationBarItem(
                    selected = selectedItem == 3,
                    onClick = { onClickNav(3) },
                    icon = { Icon(Icons.Default.Person, contentDescription = "Preferencias") },
                    label = { Text("Preferencias") }
                )
            }
        }
    ) { innerPadding ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.TopCenter
        ) {
            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(notificationItems){ it ->
                    NotificationCard(onClick = {
                        onClickNotif(it.id)
                    }, notificationItem = it)
                }
            }
        }
    }
}

@Preview
@Composable
fun NotificationScreenPreview(){
    Classwork_ExamScreenTheme()
    {
        NotificationScreen(
            onBack = {},
            onClickNav = {it -> },
            onClickNotif = {it -> },
            selectedItem = 2
        )
    }
}
