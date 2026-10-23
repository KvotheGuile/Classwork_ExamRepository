package mar.frias.classwork_examscreen

import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


@Composable
fun AppNavigation(modifier: Modifier = Modifier){
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "notif/0",
        modifier = modifier
    ){

        composable(
            route = "notif/{id}",
            arguments = listOf(
                navArgument("id"){
                    type = NavType.IntType
                }
            )
        )
        {   entrance ->
            val id = entrance.arguments?.getInt("id") ?: 0
            NotificationScreen(
                onBack = { navController.popBackStack() },
                onClickNav = { it ->
                    navController.navigate("notif/$it")
                },
                onClickNotif = {it ->
                    // Go to post
                    Toast.makeText(context, "Going to post #$it", Toast.LENGTH_SHORT).show()
                },
                selectedItem = id
            )
        }
    }
}