/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tuks.mcrl2.dsl.mclrDsl.DataExpr;
import tuks.mcrl2.dsl.mclrDsl.MclrDslPackage;
import tuks.mcrl2.dsl.mclrDsl.VarsDecl;
import tuks.mcrl2.dsl.mclrDsl.VarsDeclList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vars Decl List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.VarsDeclListImpl#getData <em>Data</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.VarsDeclListImpl#getVarialbes <em>Varialbes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarsDeclListImpl extends ProcExprTermImpl implements VarsDeclList
{
  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected DataExpr data;

  /**
   * The cached value of the '{@link #getVarialbes() <em>Varialbes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarialbes()
   * @generated
   * @ordered
   */
  protected EList<VarsDecl> varialbes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarsDeclListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MclrDslPackage.Literals.VARS_DECL_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExpr getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(DataExpr newData, NotificationChain msgs)
  {
    DataExpr oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.VARS_DECL_LIST__DATA, oldData, newData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(DataExpr newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.VARS_DECL_LIST__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.VARS_DECL_LIST__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.VARS_DECL_LIST__DATA, newData, newData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarsDecl> getVarialbes()
  {
    if (varialbes == null)
    {
      varialbes = new EObjectContainmentEList<VarsDecl>(VarsDecl.class, this, MclrDslPackage.VARS_DECL_LIST__VARIALBES);
    }
    return varialbes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MclrDslPackage.VARS_DECL_LIST__DATA:
        return basicSetData(null, msgs);
      case MclrDslPackage.VARS_DECL_LIST__VARIALBES:
        return ((InternalEList<?>)getVarialbes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MclrDslPackage.VARS_DECL_LIST__DATA:
        return getData();
      case MclrDslPackage.VARS_DECL_LIST__VARIALBES:
        return getVarialbes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclrDslPackage.VARS_DECL_LIST__DATA:
        setData((DataExpr)newValue);
        return;
      case MclrDslPackage.VARS_DECL_LIST__VARIALBES:
        getVarialbes().clear();
        getVarialbes().addAll((Collection<? extends VarsDecl>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MclrDslPackage.VARS_DECL_LIST__DATA:
        setData((DataExpr)null);
        return;
      case MclrDslPackage.VARS_DECL_LIST__VARIALBES:
        getVarialbes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MclrDslPackage.VARS_DECL_LIST__DATA:
        return data != null;
      case MclrDslPackage.VARS_DECL_LIST__VARIALBES:
        return varialbes != null && !varialbes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VarsDeclListImpl
