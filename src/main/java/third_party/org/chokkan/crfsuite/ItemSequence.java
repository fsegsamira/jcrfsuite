/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package third_party.org.chokkan.crfsuite;

public class ItemSequence {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public ItemSequence(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ItemSequence obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        crfsuiteJNI.delete_ItemSequence(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ItemSequence() {
    this(crfsuiteJNI.new_ItemSequence__SWIG_0(), true);
  }

  public ItemSequence(long n) {
    this(crfsuiteJNI.new_ItemSequence__SWIG_1(n), true);
  }

  public long size() {
    return crfsuiteJNI.ItemSequence_size(swigCPtr, this);
  }

  public long capacity() {
    return crfsuiteJNI.ItemSequence_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    crfsuiteJNI.ItemSequence_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return crfsuiteJNI.ItemSequence_isEmpty(swigCPtr, this);
  }

  public void clear() {
    crfsuiteJNI.ItemSequence_clear(swigCPtr, this);
  }

  public void add(Item x) {
    crfsuiteJNI.ItemSequence_add(swigCPtr, this, Item.getCPtr(x), x);
  }

  public Item get(int i) {
    return new Item(crfsuiteJNI.ItemSequence_get(swigCPtr, this, i), false);
  }

  public void set(int i, Item val) {
    crfsuiteJNI.ItemSequence_set(swigCPtr, this, i, Item.getCPtr(val), val);
  }

}
