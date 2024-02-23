package com.bidease.connect.android.demo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bidease.ads.mediation.LogService;
import com.bidease.ads.mediation.SdkLog;
import com.bidease.ads.mediation.SdkLogDatabaseService;

import java.util.List;

public class TestLogServiceFactory {
    public static LogService getLogService() {
        return new LogService(
                (logRequest, webServiceCallback) -> {

                },
                new SdkLogDatabaseService() {
                    @Override
                    public void save(@NonNull List<SdkLog> list, @Nullable OnSdkLogSaveCallback onSdkLogSaveCallback) {

                    }

                    @Override
                    public void shiftExactly(int i, @Nullable OnSdkLogDataLoadCallback onSdkLogDataLoadCallback) {

                    }
                }
        );
    }
}
