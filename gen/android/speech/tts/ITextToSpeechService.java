/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\android_workspace2\\system_code\\src\\android\\speech\\tts\\ITextToSpeechService.aidl
 */
package android.speech.tts;
/**
 * Interface for TextToSpeech to talk to TextToSpeechService.
 *
 * {@hide}
 */
public interface ITextToSpeechService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.speech.tts.ITextToSpeechService
{
private static final java.lang.String DESCRIPTOR = "android.speech.tts.ITextToSpeechService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.speech.tts.ITextToSpeechService interface,
 * generating a proxy if needed.
 */
public static android.speech.tts.ITextToSpeechService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.speech.tts.ITextToSpeechService))) {
return ((android.speech.tts.ITextToSpeechService)iin);
}
return new android.speech.tts.ITextToSpeechService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_speak:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _result = this.speak(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_synthesizeToFile:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _result = this.synthesizeToFile(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_playAudio:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.net.Uri _arg1;
if ((0!=data.readInt())) {
_arg1 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
int _arg2;
_arg2 = data.readInt();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _result = this.playAudio(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_playSilence:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
long _arg1;
_arg1 = data.readLong();
int _arg2;
_arg2 = data.readInt();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
int _result = this.playSilence(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_isSpeaking:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSpeaking();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
int _result = this.stop(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLanguage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getLanguage();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_isLanguageAvailable:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.isLanguageAvailable(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getFeaturesForLanguage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String[] _result = this.getFeaturesForLanguage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_loadLanguage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.loadLanguage(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setCallback:
{
data.enforceInterface(DESCRIPTOR);
android.os.IBinder _arg0;
_arg0 = data.readStrongBinder();
android.speech.tts.ITextToSpeechCallback _arg1;
_arg1 = android.speech.tts.ITextToSpeechCallback.Stub.asInterface(data.readStrongBinder());
this.setCallback(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.speech.tts.ITextToSpeechService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Tells the engine to synthesize some speech and play it back.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param text The text to synthesize.
     * @param queueMode Determines what to do to requests already in the queue.
     * @param param Request parameters.
     */
@Override public int speak(android.os.IBinder callingInstance, java.lang.String text, int queueMode, android.os.Bundle params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
_data.writeString(text);
_data.writeInt(queueMode);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_speak, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Tells the engine to synthesize some speech and write it to a file.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param text The text to synthesize.
     * @param filename The file to write the synthesized audio to.
     * @param param Request parameters.
     */
@Override public int synthesizeToFile(android.os.IBinder callingInstance, java.lang.String text, java.lang.String filename, android.os.Bundle params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
_data.writeString(text);
_data.writeString(filename);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_synthesizeToFile, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Plays an existing audio resource.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param audioUri URI for the audio resource (a file or android.resource URI)
     * @param queueMode Determines what to do to requests already in the queue.
     * @param param Request parameters.
     */
@Override public int playAudio(android.os.IBinder callingInstance, android.net.Uri audioUri, int queueMode, android.os.Bundle params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
if ((audioUri!=null)) {
_data.writeInt(1);
audioUri.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(queueMode);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_playAudio, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Plays silence.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param duration Number of milliseconds of silence to play.
     * @param queueMode Determines what to do to requests already in the queue.
     * @param param Request parameters.
     */
@Override public int playSilence(android.os.IBinder callingInstance, long duration, int queueMode, android.os.Bundle params) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
_data.writeLong(duration);
_data.writeInt(queueMode);
if ((params!=null)) {
_data.writeInt(1);
params.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_playSilence, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Checks whether the service is currently playing some audio.
     */
@Override public boolean isSpeaking() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSpeaking, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Interrupts the current utterance (if from the given app) and removes any utterances
     * in the queue that are from the given app.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     */
@Override public int stop(android.os.IBinder callingInstance) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(callingInstance);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the language, country and variant currently being used by the TTS engine.
     *
     * Can be called from multiple threads.
     *
     * @return A 3-element array, containing language (ISO 3-letter code),
     *         country (ISO 3-letter code) and variant used by the engine.
     *         The country and variant may be {@code ""}. If country is empty, then variant must
     *         be empty too.
     */
@Override public java.lang.String[] getLanguage() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLanguage, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Checks whether the engine supports a given language.
     *
     * @param lang ISO-3 language code.
     * @param country ISO-3 country code. May be empty or null.
     * @param variant Language variant. May be empty or null.
     * @return Code indicating the support status for the locale.
     *         One of {@link TextToSpeech#LANG_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_VAR_AVAILABLE},
     *         {@link TextToSpeech#LANG_MISSING_DATA}
     *         {@link TextToSpeech#LANG_NOT_SUPPORTED}.
     */
@Override public int isLanguageAvailable(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(lang);
_data.writeString(country);
_data.writeString(variant);
mRemote.transact(Stub.TRANSACTION_isLanguageAvailable, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns a list of features available for a given language. Elements of the returned
     * string array can be passed in as keys to {@link TextToSpeech#speak} and
     * {@link TextToSpeech#synthesizeToFile} to select a given feature or features to be
     * used during synthesis.
     *
     * @param lang ISO-3 language code.
     * @param country ISO-3 country code. May be empty or null.
     * @param variant Language variant. May be empty or null.
     * @return An array of strings containing the set of features supported for
     *         the supplied locale. The array of strings must not contain 
     *         duplicates.
     */
@Override public java.lang.String[] getFeaturesForLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(lang);
_data.writeString(country);
_data.writeString(variant);
mRemote.transact(Stub.TRANSACTION_getFeaturesForLanguage, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Notifies the engine that it should load a speech synthesis language.
     *
     * @param lang ISO-3 language code.
     * @param country ISO-3 country code. May be empty or null.
     * @param variant Language variant. May be empty or null.
     * @return Code indicating the support status for the locale.
     *         One of {@link TextToSpeech#LANG_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_VAR_AVAILABLE},
     *         {@link TextToSpeech#LANG_MISSING_DATA}
     *         {@link TextToSpeech#LANG_NOT_SUPPORTED}.
     */
@Override public int loadLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(lang);
_data.writeString(country);
_data.writeString(variant);
mRemote.transact(Stub.TRANSACTION_loadLanguage, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Sets the callback that will be notified when playback of utterance from the
     * given app are completed.
     *
     * @param callingApp Package name for the app whose utterance the callback will handle.
     * @param cb The callback.
     */
@Override public void setCallback(android.os.IBinder caller, android.speech.tts.ITextToSpeechCallback cb) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder(caller);
_data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_speak = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_synthesizeToFile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_playAudio = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_playSilence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_isSpeaking = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_isLanguageAvailable = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getFeaturesForLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_loadLanguage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
}
/**
     * Tells the engine to synthesize some speech and play it back.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param text The text to synthesize.
     * @param queueMode Determines what to do to requests already in the queue.
     * @param param Request parameters.
     */
public int speak(android.os.IBinder callingInstance, java.lang.String text, int queueMode, android.os.Bundle params) throws android.os.RemoteException;
/**
     * Tells the engine to synthesize some speech and write it to a file.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param text The text to synthesize.
     * @param filename The file to write the synthesized audio to.
     * @param param Request parameters.
     */
public int synthesizeToFile(android.os.IBinder callingInstance, java.lang.String text, java.lang.String filename, android.os.Bundle params) throws android.os.RemoteException;
/**
     * Plays an existing audio resource.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param audioUri URI for the audio resource (a file or android.resource URI)
     * @param queueMode Determines what to do to requests already in the queue.
     * @param param Request parameters.
     */
public int playAudio(android.os.IBinder callingInstance, android.net.Uri audioUri, int queueMode, android.os.Bundle params) throws android.os.RemoteException;
/**
     * Plays silence.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     * @param duration Number of milliseconds of silence to play.
     * @param queueMode Determines what to do to requests already in the queue.
     * @param param Request parameters.
     */
public int playSilence(android.os.IBinder callingInstance, long duration, int queueMode, android.os.Bundle params) throws android.os.RemoteException;
/**
     * Checks whether the service is currently playing some audio.
     */
public boolean isSpeaking() throws android.os.RemoteException;
/**
     * Interrupts the current utterance (if from the given app) and removes any utterances
     * in the queue that are from the given app.
     *
     * @param callingInstance a binder representing the identity of the calling
     *        TextToSpeech object.
     */
public int stop(android.os.IBinder callingInstance) throws android.os.RemoteException;
/**
     * Returns the language, country and variant currently being used by the TTS engine.
     *
     * Can be called from multiple threads.
     *
     * @return A 3-element array, containing language (ISO 3-letter code),
     *         country (ISO 3-letter code) and variant used by the engine.
     *         The country and variant may be {@code ""}. If country is empty, then variant must
     *         be empty too.
     */
public java.lang.String[] getLanguage() throws android.os.RemoteException;
/**
     * Checks whether the engine supports a given language.
     *
     * @param lang ISO-3 language code.
     * @param country ISO-3 country code. May be empty or null.
     * @param variant Language variant. May be empty or null.
     * @return Code indicating the support status for the locale.
     *         One of {@link TextToSpeech#LANG_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_VAR_AVAILABLE},
     *         {@link TextToSpeech#LANG_MISSING_DATA}
     *         {@link TextToSpeech#LANG_NOT_SUPPORTED}.
     */
public int isLanguageAvailable(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException;
/**
     * Returns a list of features available for a given language. Elements of the returned
     * string array can be passed in as keys to {@link TextToSpeech#speak} and
     * {@link TextToSpeech#synthesizeToFile} to select a given feature or features to be
     * used during synthesis.
     *
     * @param lang ISO-3 language code.
     * @param country ISO-3 country code. May be empty or null.
     * @param variant Language variant. May be empty or null.
     * @return An array of strings containing the set of features supported for
     *         the supplied locale. The array of strings must not contain 
     *         duplicates.
     */
public java.lang.String[] getFeaturesForLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException;
/**
     * Notifies the engine that it should load a speech synthesis language.
     *
     * @param lang ISO-3 language code.
     * @param country ISO-3 country code. May be empty or null.
     * @param variant Language variant. May be empty or null.
     * @return Code indicating the support status for the locale.
     *         One of {@link TextToSpeech#LANG_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_AVAILABLE},
     *         {@link TextToSpeech#LANG_COUNTRY_VAR_AVAILABLE},
     *         {@link TextToSpeech#LANG_MISSING_DATA}
     *         {@link TextToSpeech#LANG_NOT_SUPPORTED}.
     */
public int loadLanguage(java.lang.String lang, java.lang.String country, java.lang.String variant) throws android.os.RemoteException;
/**
     * Sets the callback that will be notified when playback of utterance from the
     * given app are completed.
     *
     * @param callingApp Package name for the app whose utterance the callback will handle.
     * @param cb The callback.
     */
public void setCallback(android.os.IBinder caller, android.speech.tts.ITextToSpeechCallback cb) throws android.os.RemoteException;
}
