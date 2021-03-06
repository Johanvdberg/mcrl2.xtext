/**
 * generated by Xtext 2.11.0.beta2
 */
package tuks.mcrl2.dsl.mclrDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tuks.mcrl2.dsl.mclrDsl.Assignment;
import tuks.mcrl2.dsl.mclrDsl.DataExpr;
import tuks.mcrl2.dsl.mclrDsl.MclrDslPackage;
import tuks.mcrl2.dsl.mclrDsl.VarName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.AssignmentImpl#getId <em>Id</em>}</li>
 *   <li>{@link tuks.mcrl2.dsl.mclrDsl.impl.AssignmentImpl#getData_exp <em>Data exp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends MinimalEObjectImpl.Container implements Assignment
{
  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected VarName id;

  /**
   * The cached value of the '{@link #getData_exp() <em>Data exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData_exp()
   * @generated
   * @ordered
   */
  protected DataExpr data_exp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return MclrDslPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarName getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetId(VarName newId, NotificationChain msgs)
  {
    VarName oldId = id;
    id = newId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.ASSIGNMENT__ID, oldId, newId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(VarName newId)
  {
    if (newId != id)
    {
      NotificationChain msgs = null;
      if (id != null)
        msgs = ((InternalEObject)id).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.ASSIGNMENT__ID, null, msgs);
      if (newId != null)
        msgs = ((InternalEObject)newId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.ASSIGNMENT__ID, null, msgs);
      msgs = basicSetId(newId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.ASSIGNMENT__ID, newId, newId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataExpr getData_exp()
  {
    return data_exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData_exp(DataExpr newData_exp, NotificationChain msgs)
  {
    DataExpr oldData_exp = data_exp;
    data_exp = newData_exp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MclrDslPackage.ASSIGNMENT__DATA_EXP, oldData_exp, newData_exp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData_exp(DataExpr newData_exp)
  {
    if (newData_exp != data_exp)
    {
      NotificationChain msgs = null;
      if (data_exp != null)
        msgs = ((InternalEObject)data_exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.ASSIGNMENT__DATA_EXP, null, msgs);
      if (newData_exp != null)
        msgs = ((InternalEObject)newData_exp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MclrDslPackage.ASSIGNMENT__DATA_EXP, null, msgs);
      msgs = basicSetData_exp(newData_exp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MclrDslPackage.ASSIGNMENT__DATA_EXP, newData_exp, newData_exp));
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
      case MclrDslPackage.ASSIGNMENT__ID:
        return basicSetId(null, msgs);
      case MclrDslPackage.ASSIGNMENT__DATA_EXP:
        return basicSetData_exp(null, msgs);
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
      case MclrDslPackage.ASSIGNMENT__ID:
        return getId();
      case MclrDslPackage.ASSIGNMENT__DATA_EXP:
        return getData_exp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MclrDslPackage.ASSIGNMENT__ID:
        setId((VarName)newValue);
        return;
      case MclrDslPackage.ASSIGNMENT__DATA_EXP:
        setData_exp((DataExpr)newValue);
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
      case MclrDslPackage.ASSIGNMENT__ID:
        setId((VarName)null);
        return;
      case MclrDslPackage.ASSIGNMENT__DATA_EXP:
        setData_exp((DataExpr)null);
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
      case MclrDslPackage.ASSIGNMENT__ID:
        return id != null;
      case MclrDslPackage.ASSIGNMENT__DATA_EXP:
        return data_exp != null;
    }
    return super.eIsSet(featureID);
  }

} //AssignmentImpl
