package org.schabi.newpipe.cast;

import android.content.Context;

import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import com.google.android.gms.cast.framework.media.CastMediaOptions;

import java.util.List;

public final class MandoCastOptionsProvider implements OptionsProvider {

    @Override
    public CastOptions getCastOptions(final Context appContext) {
        final CastMediaOptions mediaOptions =
                new CastMediaOptions.Builder().build();

        return new CastOptions.Builder()
                .setReceiverApplicationId(
                        CastMediaControlIntent.DEFAULT_MEDIA_RECEIVER_APPLICATION_ID)
                .setCastMediaOptions(mediaOptions)
                .build();
    }

    @Override
    public List<SessionProvider> getAdditionalSessionProviders(
            final Context appContext) {
        return null;
    }
}
