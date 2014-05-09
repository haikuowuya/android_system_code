 package android.graphics;

/**
 * 
 * PathEffect is the base class for objects in the Paint that affect the
 * geometry of a drawing primitive before it is transformed by the canvas'
 * matrix and drawn.
 */
public class PathEffect
{

	protected void finalize() throws Throwable
	{
		nativeDestructor(native_instance);
	}

	private static native void nativeDestructor(int native_patheffect);

	int native_instance;
}
