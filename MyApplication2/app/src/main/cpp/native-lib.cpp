#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_gmail_rishabh23jain_myapplication_myFirstActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from rishabh jain jain";
    return env->NewStringUTF(hello.c_str());
}
