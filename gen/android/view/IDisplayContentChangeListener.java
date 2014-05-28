/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\android_workspace\\system_code\\src\\android\\view\\IDisplayContentChangeListener.aidl
 */
package android.view;
/**
 * Interface for observing content changes on a display.
 *
 * {@hide}
 */
public interface IDisplayContentChangeListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IDisplayContentChangeListener
{
private static final java.lang.String DESCRIPTOR = "android.view.IDisplayContentChangeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an android.view.IDisplayContentChangeListener interface,
 * generating a proxy if needed.
 */
public static android.view.IDisplayContentChangeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IDisplayContentChangeListener))) {
return ((android.view.IDisplayContentChangeListener)iin);
}
return new android.view.IDisplayContentChangeListener.Stub.Proxy(obj);
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
case TRANSACTION_onWindowTransition:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.view.WindowInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = android.view.WindowInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onWindowTransition(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onRectangleOnScreenRequested:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
android.graphics.Rect _arg1;
if ((0!=data.readInt())) {
_arg1 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onRectangleOnScreenRequested(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onWindowLayersChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onWindowLayersChanged(_arg0);
return true;
}
case TRANSACTION_onRotationChanged:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.onRotationChanged(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IDisplayContentChangeListener
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
@Override public void onWindowTransition(int displayId, int transition, android.view.WindowInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
_data.writeInt(transition);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onWindowTransition, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRectangleOnScreenRequested(int displayId, android.graphics.Rect rectangle, boolean immediate) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
if ((rectangle!=null)) {
_data.writeInt(1);
rectangle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((immediate)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onRectangleOnScreenRequested, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onWindowLayersChanged(int displayId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(displayId);
mRemote.transact(Stub.TRANSACTION_onWindowLayersChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
@Override public void onRotationChanged(int rotation) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(rotation);
mRemote.transact(Stub.TRANSACTION_onRotationChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onWindowTransition = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onRectangleOnScreenRequested = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onWindowLayersChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onRotationChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void onWindowTransition(int displayId, int transition, android.view.WindowInfo info) throws android.os.RemoteException;
public void onRectangleOnScreenRequested(int displayId, android.graphics.Rect rectangle, boolean immediate) throws android.os.RemoteException;
public void onWindowLayersChanged(int displayId) throws android.os.RemoteException;
public void onRotationChanged(int rotation) throws android.os.RemoteException;
}
