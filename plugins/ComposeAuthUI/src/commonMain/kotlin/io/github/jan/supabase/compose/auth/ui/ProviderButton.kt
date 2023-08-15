package io.github.jan.supabase.compose.auth.ui

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp
import io.github.jan.supabase.gotrue.providers.OAuthProvider

@Composable
fun RowScope.ProviderButtonContent(provider: OAuthProvider, text: String = "Login in with ${provider.name.capitalize()}") {
    providerPainter(provider, LocalDensity.current)?.let {
        Icon(
            painter = it,
            contentDescription = "Sign in with ${provider.name}",
            tint = Color.Unspecified,
            modifier = Modifier.size(24.dp)
        )
    }
    Spacer(Modifier.width(8.dp))
    Text(text)
}

private fun String.capitalize(): String {
    return replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
}