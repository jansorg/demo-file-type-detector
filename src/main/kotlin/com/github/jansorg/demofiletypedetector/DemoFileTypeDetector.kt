package com.github.jansorg.demofiletypedetector

import com.intellij.json.JsonFileType
import com.intellij.openapi.fileTypes.FileType
import com.intellij.openapi.fileTypes.FileTypeRegistry.FileTypeDetector
import com.intellij.openapi.util.io.ByteSequence
import com.intellij.openapi.vfs.VirtualFile

class DemoFileTypeDetector : FileTypeDetector {
    override fun detect(file: VirtualFile, firstBytes: ByteSequence, firstCharsIfText: CharSequence?): FileType? {
        return when {
            file.name.endsWith("no_local_history") -> JsonFileType.INSTANCE
            else -> null
        }
    }
}
