package io.github.mahmoudmohsen.gtube.ui.components

import io.github.mahmoudmohsen.gtube.data.model.Video
import io.github.mahmoudmohsen.gtube.data.model.VideoCollaborator
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class VideoCollaboratorTest {
    @Test
    fun channelNameConnectorsDoNotCreateCollaborators() {
        listOf(
            "Retro gaming with deadfred",
            "Binging with Babish",
            "Dungeons and Dragons"
        ).forEach { channelName ->
            assertTrue(video(channelName = channelName).collaboratorItems().isEmpty())
        }
    }

    @Test
    fun verifiedCollaboratorMetadataCreatesCollaboratorList() {
        val collaborators = listOf(
            VideoCollaborator(name = "First", channelId = "UC-first"),
            VideoCollaborator(name = "Second", channelId = "UC-second")
        )

        assertEquals(collaborators, video(collaborators = collaborators).collaboratorItems())
    }

    private fun video(
        channelName: String = "Channel",
        collaborators: List<VideoCollaborator> = emptyList()
    ) = Video(
        id = "video-id",
        title = "Video",
        channelName = channelName,
        channelId = "UC-channel",
        thumbnailUrl = "",
        duration = 60,
        viewCount = 0,
        uploadDate = "",
        collaborators = collaborators
    )
}
