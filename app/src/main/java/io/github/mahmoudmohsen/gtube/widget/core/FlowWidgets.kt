package io.github.mahmoudmohsen.gtube.widget.core

import android.content.Context
import androidx.glance.appwidget.updateAll
import io.github.mahmoudmohsen.gtube.widget.downloads.DownloadsWidget
import io.github.mahmoudmohsen.gtube.widget.nowplaying.NowPlayingWidget
import io.github.mahmoudmohsen.gtube.widget.quickactions.QuickActionsWidget
import io.github.mahmoudmohsen.gtube.widget.recent.RecentlyPlayedWidget
import io.github.mahmoudmohsen.gtube.widget.recognize.RecognizeWidget
import io.github.mahmoudmohsen.gtube.widget.turntable.TurntableWidget

/** Registry of every Flow widget — used to re-render all of them on app theme changes. */
object FlowWidgets {
    suspend fun updateAll(context: Context) {
        NowPlayingWidget().updateAll(context)
        TurntableWidget().updateAll(context)
        QuickActionsWidget().updateAll(context)
        RecognizeWidget().updateAll(context)
        RecentlyPlayedWidget().updateAll(context)
        DownloadsWidget().updateAll(context)
    }
}
