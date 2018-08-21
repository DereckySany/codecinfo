package com.parseus.codecinfo.codecinfo.colorformats

@Suppress("EnumEntryName")
enum class OtherColorFormat(val value: Int) {

    // Intel
    OMX_INTEL_COLOR_FormatHalYV12(0x32315659),
    OMX_INTEL_COLOR_FormatYUV420PackedSemiPlanar(0x7FA00E00),
    OMX_INTEL_COLOR_FormatYUV420PackedSemiPlanar_Tiled(0x7FA00F00),

    // Sony
    OMX_STE_COLOR_FormatYUV420PackedSemiPlanarMB(0x7FA00000),
    OMX_COLOR_FormatYUV420MBPackedSemiPlanar(0x7FFFFFFE),

    // Texas Instruments
    OMX_TI_COLOR_FormatYUV420PackedSemiPlanarInterlaced(0x7F000001),
    OMX_TI_COLOR_FormatRawBayer10bitStereo(0x7F000002),
    OMX_TI_COLOR_FormatYUV420PackedSemiPlanar(0x7F000100);

    companion object {
        fun from(findValue: Int): String? = OtherColorFormat.values().find { it.value == findValue }?.name
    }

}