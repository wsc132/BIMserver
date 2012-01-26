/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

import org.bimserver.emf.IdEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Document Information Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatedDocuments <em>Related Documents</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface IfcDocumentInformationRelationship extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Relating Document</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointer <em>Is Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relating Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relating Document</em>' reference.
	 * @see #isSetRelatingDocument()
	 * @see #unsetRelatingDocument()
	 * @see #setRelatingDocument(IfcDocumentInformation)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship_RelatingDocument()
	 * @see org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointer
	 * @model opposite="IsPointer" unsettable="true"
	 * @generated
	 */
	IfcDocumentInformation getRelatingDocument();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relating Document</em>' reference.
	 * @see #isSetRelatingDocument()
	 * @see #unsetRelatingDocument()
	 * @see #getRelatingDocument()
	 * @generated
	 */
	void setRelatingDocument(IfcDocumentInformation value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatingDocument()
	 * @see #getRelatingDocument()
	 * @see #setRelatingDocument(IfcDocumentInformation)
	 * @generated
	 */
	void unsetRelatingDocument();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatingDocument <em>Relating Document</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relating Document</em>' reference is set.
	 * @see #unsetRelatingDocument()
	 * @see #getRelatingDocument()
	 * @see #setRelatingDocument(IfcDocumentInformation)
	 * @generated
	 */
	boolean isSetRelatingDocument();

	/**
	 * Returns the value of the '<em><b>Related Documents</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcDocumentInformation}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointedTo <em>Is Pointed To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related Documents</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Documents</em>' reference list.
	 * @see #isSetRelatedDocuments()
	 * @see #unsetRelatedDocuments()
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship_RelatedDocuments()
	 * @see org.bimserver.models.ifc2x3.IfcDocumentInformation#getIsPointedTo
	 * @model opposite="IsPointedTo" unsettable="true"
	 * @generated
	 */
	EList<IfcDocumentInformation> getRelatedDocuments();

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatedDocuments <em>Related Documents</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelatedDocuments()
	 * @see #getRelatedDocuments()
	 * @generated
	 */
	void unsetRelatedDocuments();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelatedDocuments <em>Related Documents</em>}' reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Related Documents</em>' reference list is set.
	 * @see #unsetRelatedDocuments()
	 * @see #getRelatedDocuments()
	 * @generated
	 */
	boolean isSetRelatedDocuments();

	/**
	 * Returns the value of the '<em><b>Relationship Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #setRelationshipType(String)
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcDocumentInformationRelationship_RelationshipType()
	 * @model unsettable="true"
	 * @generated
	 */
	String getRelationshipType();

	/**
	 * Sets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship Type</em>' attribute.
	 * @see #isSetRelationshipType()
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @generated
	 */
	void setRelationshipType(String value);

	/**
	 * Unsets the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	void unsetRelationshipType();

	/**
	 * Returns whether the value of the '{@link org.bimserver.models.ifc2x3.IfcDocumentInformationRelationship#getRelationshipType <em>Relationship Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Relationship Type</em>' attribute is set.
	 * @see #unsetRelationshipType()
	 * @see #getRelationshipType()
	 * @see #setRelationshipType(String)
	 * @generated
	 */
	boolean isSetRelationshipType();

} // IfcDocumentInformationRelationship
