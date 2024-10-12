package com.viniciussieben.ded.strategy

import com.viniciussieben.ded.model.Attributes

interface AttributeDistribution {
    fun distributeAttributes(points: Int): Attributes
}