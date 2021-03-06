SUMMARY     = "Telematics Recorder AGL Demonstration"
DESCRIPTION = "AGL Application for demonstrating telematics recorder functionality"
HOMEPAGE    = "https://gerrit.automotivelinux.org/gerrit/#/admin/projects/apps/agl-telematics-demo-recorder"
SECTION     = "apps"

LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "git://github.com/konsulko/telematics-recorder.git;protocol=https"
SRCREV  = "70f06a19860a95d8aa22e6251bf46961d3483bbb"

PV = "1.0+git${SRCPV}"
S  = "${WORKDIR}/git"

# build-time dependencies
DEPENDS = "glib-2.0 mosquitto"

inherit cmake aglwgt

RDEPENDS_${PN} += " \
	agl-service-can-low-level \
	agl-service-gps \
	agl-service-network \
	libmosquitto1 \
"
